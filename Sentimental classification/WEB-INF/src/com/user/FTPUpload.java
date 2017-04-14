/**
 * 
 */
package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.DAOFactory.User;
import com.rsa.GenerateRandomNumber;
import com.rsa.RSA_File_EncryptionDecryption;
import com.rsa.SerializeToDatabase;
import com.util.Utility;


public class FTPUpload extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String username="";
	private static int userid=0;
	
	
	@SuppressWarnings("deprecation")
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		try
		{
		   RequestDispatcher rd = null;
		  // String uploadSubject = "";
		   int ownerId=0;
		
		  
		   
		   
		   HttpSession session = req.getSession(false);  
		   
		   if(session != null)
			{
			  username = (String) session.getAttribute("userid");
			 
			
		   
			String path=req.getParameter("path");
			System.out.println("Source ::> "+path);
			String filename=req.getParameter("fname");
			System.out.println("File Name ::> "+filename);
			
			int server_id=1;
            
            String localFilePath=path;
           System.out.println("localFilePath is--->"+localFilePath);
			File file=new File(localFilePath);
		   
			System.out.println("File Name ="+file);
			String md=Utility.MD(file);//mac generation for file 
			
			if(User.CHKMD(md))
			{
				rd=req.getRequestDispatcher("/Files/JSP/User/upload_file.jsp?no=0&no1=2");
				rd.forward(req,res);
			}
		   
			else
			{
				
				if ( session.getAttribute( "waitPage" ) == null )
	    	   
	       	 {  
	    	   session.setAttribute( "waitPage", Boolean.TRUE );  
	    	   PrintWriter out = res.getWriter();  
	    	   out.println( "<html><head>" );  
	    	   out.println( "<title>Please Wait...</title>" );  
	       	   out.println( "<meta http-equiv=\"Refresh\" content=\"0\">" );  
	    	   out.println( "</head><body bgcolor=''>" );  
	    	   out.println( "<br><br><br>" );
	    	   out.print( "<center><img src='Files/Images/uploading-1.gif' width='200' height='200'></img><br><br>");
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please Do not press Back or Refresh button.......<br>  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "File Uploading is in Process......  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please wait....</h1></center");  
	    	   out.close();  
	       }  
	       else 
	       { 
	    	    session.removeAttribute( "waitPage" );  
				
					PrintWriter out=res.getWriter();
					res.setContentType("text/html");
					
					
			 // ====== *Encryption Starts* ===========
					
					PublicKey pubKey = (PublicKey) SerializeToDatabase.getPublicKey();
					System.out.println("Public Key is :="+pubKey);
					
					String fileName = req.getRealPath("") + "/Upload/"+ file.getName();
					
					String destFilePath = req.getRealPath("") + "/Encryption/"+ file.getName();
					System.out.println("Destination Path is ="+destFilePath);
					boolean flg = RSA_File_EncryptionDecryption.encryptFile(fileName, destFilePath,pubKey);
					
					
					System.out.println("encrypted data status :="+flg);
					if(flg)
					{
						// Random Number //
						String fnm = file.getName();
						int ran = GenerateRandomNumber.generate3digitNumber();
						
						String file_nm = fnm;
						
						
						/* Uploading File On Cloud (Starts)*/
						
						ArrayList<String> list= User.getCloudByServerID(server_id);
						
						
						String ftpserver = list.get(0).toString();// ftp.drivehq.com
				        String ftpusername = list.get(1).toString();// cloud_ name
				        String ftppassword = list.get(2).toString();//cloud _ password
						String dirToUploadFile=list.get(3).toString();//cloud_ directory
							
						System.out.println("Directory to upload is-->"+dirToUploadFile);
						 File f = new File(destFilePath);
		        
	    				 FileUpload.upload(ftpserver,ftpusername,ftppassword,file_nm,f,dirToUploadFile);
	    				 System.out.println("**File Uploaded To Cloud Successfully **");
					  
						/* Adding the upload Transaction details (Start)*/
	    							
						int dotPos = filename.lastIndexOf(".");
					    String extension = filename.substring(dotPos);
					    String fileType=extension;
						
						Calendar currentDate = Calendar.getInstance();
						SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						String date = formatter.format(currentDate.getTime());
						
						ownerId = User.getDataOwnerId(username);
						
						boolean flag1 = User.addUploadTransaction(filename,fileType,date,server_id,md);
					
						/* Adding the upload Transaction details (End)*/
						
						/* Displaying Success Message  */
						System.out.println("Flag value--->"+flag1);
						if(flag1)
						{
							
							rd=req.getRequestDispatcher("/Files/JSP/User/upload_file.jsp?no=2");
							rd.forward(req,res);
						}
						else
						{
							
							rd=req.getRequestDispatcher("/Files/JSP/User/upload_file.jsp?no=0&no1=1");
							rd.forward(req,res);
						}
						
						
					}					
	             }
	       
			   }
		    }
		   
		          else
		           {
			        res.sendRedirect(req.getContextPath()+"index.jsp?no=4");
		           }
		}//try 
				catch(Exception e)
				{
					System.out.println("\n ******** Exception In FTPUpload Servlet : \n");
					e.printStackTrace();
				}
		
	
		}
}
