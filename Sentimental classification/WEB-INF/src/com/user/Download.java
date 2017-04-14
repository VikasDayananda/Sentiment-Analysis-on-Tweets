/**
 * 
 */
package com.user;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOFactory.User;
import com.rsa.RSA_File_EncryptionDecryption;
import com.rsa.SerializeToDatabase;
import com.util.Cloud1_Download;




public class Download extends HttpServlet
{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		try
		{
			String downloadDir = "";
		  String username = "";
		  int fileid=0;
		  HttpSession session = req.getSession();  
		  username = (String) session.getAttribute("userid");		  
		  String fileName="";
		  boolean TransactionSuccessful=false;
		  fileid = Integer.parseInt(req.getParameter("fileId").toString());
		  
		  
		  fileName=User.getFileName(fileid);
		  System.out.println("Selected File ID and File Name : "+fileid+"and"+fileName);
		   int userId= User.getDataOwnerId(username);
		   int server_id=1;
		  
		 
		  System.out.println("Download file name is--->"+fileName+"----Server id is---->"+server_id);
		      
			  
			  File file=new File(fileName);
			  int dotPos = fileName.lastIndexOf(".");
			  String extension =fileName.substring(dotPos);
			    
			    Calendar currentDate = Calendar.getInstance();
			    SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				String date = formatter.format(currentDate.getTime());
				boolean filePresent=false;
				
				  filePresent=User.isFilePresentServer(fileName) ;
				  if(filePresent)
					 {
						
					  if ( session.getAttribute( "waitPage" ) == null ) 
				       {  
				    	   session.setAttribute( "waitPage", Boolean.TRUE );  
				    	   PrintWriter out = res.getWriter();  
				    	   out.println( "<html><head>" );  
				    	   out.println( "<title>Please Wait...</title>" );  
				       	   out.println( "<meta http-equiv=\"Refresh\" content=\"0\">" );  
				    	   out.println( "</head><body bgcolor='#AFCF57'>" );  
				    	   out.println( "<br>" );
				    	   out.println( "<center>" );
				    	   out.print("<font color='red'>");
				    	   out.println( "Please Do not press Back or Refresh button.......<br>  " );
				    	   out.println("</font>");
				    	   out.print("<font color='#fedcba'>");
				    	   out.println( "Please,Wait..........<br>  " );
				    	   out.println( "Download Athentication In Process..." );
				    	   out.println( "<br>" );
				    	   out.println("</font>");
				    	   out.println( "<br>" );
				    	   out.print( "<img src='Files/Images/cloud_download.gif'></img><br><br>");
				    	   out.print("<font color='#AD814E'>");
				    	   out.println( "Please Do not press Back or Refresh button.......<br>  " );
				    	   out.println( "<br>" );
				    	   out.println( "Downloading is in process..." );
				    	   out.println( "<br>" );
				    	   out.println( "The File is in local server1...." );
				    	   out.println("</font>");
				    	   out.println( "<br>" );
				    	   out.println( "Please wait....</h1></center");  
				    	   out.close();  
				       }  
					  
					  //*  File Download process*//
					  
					  else 
				       { 
					    	session.removeAttribute( "waitPage" );  
					    	boolean flag = false;
					    	
					    	//* getting private key from the DB*//
					    	PrivateKey priKey = (PrivateKey) SerializeToDatabase.getPrivateKey_con();
							
					    	System.out.println("Private Key is ="+priKey);
					    	
					    	//*  cloud details*//
					    	
					    	ArrayList<String> cloud = User.getCloudByServerID(server_id);

					    	String server = cloud.get(0);

							String user = cloud.get(1);
							String pass = cloud.get(2);
							downloadDir = cloud.get(3);
							
							
							String destFilePath = req.getRealPath("") + "/Download/"+ fileName;
							
							    // File Downloading Process //
								// boolean isDownload=User.downloadFile(server, user, pass, fileName,downloadDir,destFilePath.trim());
							 
							 String isDownload = Cloud1_Download.download(server.trim(), user.trim(), pass.trim(), fileName.trim(),downloadDir.trim(),destFilePath.trim());
							 System.out.println("Download File Path :"+destFilePath);	
							 String DecryptionFilePath = req.getRealPath("") + "/Decryption/"+ fileName;
							
							 // * RSA Decryption Process * //
								boolean isDownload1= RSA_File_EncryptionDecryption.decryptFile(destFilePath, DecryptionFilePath, priKey);
								System.out.println("Decryption is over ");
					    	 	System.out.println("=====Downloaded From the Cloud=======");
					    	 	
					    	 	if(isDownload1)
								{
					    	 		// * Transaction to DB* //
								
								    String transactionStatus = "Downloaded";
								    TransactionSuccessful = User.addDownloadTransaction(userId,fileid,transactionStatus);
								    	System.out.println("Filee Downloaded Successfullyy !!!!!!");
								}
					    	 	
							  if(isDownload1 && TransactionSuccessful)
							     {
								  String processingServerUrl="";
							  	  processingServerUrl = "http://localhost:8080/Cloud_ImagTest/Pass?fileNames="+DecryptionFilePath+"&download=true";
								  System.out.println("Processing Server URL :\n"+processingServerUrl);
								  System.out.println("Response redirected to: "+server_id+"].");
								  res.sendRedirect(processingServerUrl);
										
							     }
					    	 	System.out.println("******* Thank you for Downloading ******");
					    	 			  
				       }
					 }
			  
				  
				    
		  
	
		}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("Exceoption in  Download.java");
				}
	       }
}	

