package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.Utility;


public class Sentimentprocess extends HttpServlet
{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	
	{
		System.out.println("its came inside the>>>>>>>>>>>>>>>>>>>>>sentimentprocess");
		String sensitivetype="";
		boolean flag77=false;
		 
		try {
			
			HttpSession session = request.getSession(false);  
			
			if ( session.getAttribute( "waitPage" ) == null )
		    	   
	       	 {  
	    	   session.setAttribute( "waitPage", Boolean.TRUE );  
	    	   PrintWriter out = response.getWriter();  
	    	   out.println( "<html><head>" );  
	    	   out.println( "<title>Please Wait...</title>" );  
	       	   out.println( "<meta http-equiv=\"Refresh\" content=\"0\">" );  
	    	   out.println( "</head><body bgcolor=''>" );  
	    	   out.println( "<br><br><br>" );
	    	   out.print( "<center><img src='Files/Images/Processing2.gif' width='200' height='200'></img><br><br>");
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please Do not press Back or Refresh button.......<br>  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Sentiment process of data is going on......  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please wait....</h1></center");  
	    	   out.close();  
	       } 
			
			
			
			else
			{	
			
			
				String datas="";
			
				 session.removeAttribute( "waitPage" );  
				 String stmntprcs=request.getParameter("stmntprcs");
			 
	        ArrayList<String> datafilteredtweets=new ArrayList<String>();
	        ArrayList<String> tweetsid=new ArrayList<String>();
	        ArrayList<String> relatedtopics=new ArrayList<String>();
	        
	        tweetsid = AdminDAO.gettweetsid(stmntprcs);
	        
	        for(int j=0;j<tweetsid.size();j++)
	        {
	        	
	        	int positive1=0;
	        	int negative1=0;
	        	int neutral1=0;
			        System.out.println("============ID=========="+tweetsid.get(j));
			        datas = AdminDAO.gettopic(tweetsid.get(j));
			        
			        System.out.println("related topics are>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+relatedtopics);
			        
					datafilteredtweets = AdminDAO.getfilteddata(tweetsid.get(j));
			
			
			for (String data : datafilteredtweets ) 
					  {
							  ArrayList<String> assigncount=new ArrayList<String>();
							 int positive=0;
							  int negative=0;
							  int neutral=0;
							  
						  System.out.println("filtered tweets are>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+data);
						  String[] data1=data.split(",");	
			  //#Spliting words in each line
			  for(String splitword:data1)
			  {
				  
				  
							  ArrayList<String> checknoun=new ArrayList<String>();
							  System.out.println(">>>>>>>>>>"+splitword.trim());
							  
							  
							  boolean f1=AdminDAO.checkNoun(splitword.trim());
							  
				  if(f1)
				  {
					    
				  }
				  else
				  {
					  checknoun.add(splitword.trim());
					   
						 
				  }
				  ArrayList<String> newlist=new ArrayList<String>();
				  for(int i=0;i<checknoun.size();i++)
					{
				
					  
					  
									  ArrayList<String> m_words=new ArrayList<String>();
									  m_words =AdminDAO.checkw_words();
					   
					  for(int q=0;q<m_words.size();q++)
					  {
									  System.out.println(">>>>>>>>>>>>>>>m_words1>>>>>>>>>>>>>>>>>>>>>>>"+m_words.get(q));  
									  String[] splittedline=m_words.get(q).split("-");
						
						  for (int i1 = 0; i1 < splittedline.length; i1++) 
						  {
						      
							 
							  System.out.println("splitted line is >>>>>>>>>>>>>>>>>>>>>>>>>>>"+splittedline[i1]);
							  
							  if(splittedline[i1].contains(checknoun.get(i)))
							  {
										String 	 datam_word= AdminDAO.getparticularw_word(m_words.get(q));
										
										System.out.println("particular m_word is"+datam_word);
										//checknoun.add( 2, "New" );
										checknoun.set( i, datam_word );	
							
							//newlist.add(datam_word);
								  
							  }
							  else
							  {
								  
								// System.out.println("remaing words>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+checknoun.get(i)); 
								  
							  }
							  
							  
							  
							  
						  }
						 
						  
					  }
					
					   
					  
					  System.out.println("remaing words>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+checknoun.get(i)); 
					  
				   sensitivetype= AdminDAO.checksensitivewords(checknoun.get(i),datas);
				   
				   String b[]=sensitivetype.split("~~");
				   String sentype=b[0];
				   String k=b[1];
				   int m=Integer.parseInt(k);
				   
				  
				   System.out.println("----------------------------------------checknoun.get(i)---"+checknoun.get(i));
				   
				   System.out.println("----------------------------------------Sentype---"+sentype);
				   
				   System.out.println("----------------------------------------m---"+m);
				   
				  
				 
				   
				   
				   
				
				   
				   
				   
				   
				   
				   if(sentype.equals("positive"))
				   {
					   positive++;
					 
					   
					   
				   }
				   else if(sentype.equals("negative"))
				   {
					   negative++;
				   }
				   else if(sentype.equals("neutral"))  
				   {
					 
					  neutral++;
					
				   }
				   
				   System.out.println("----------------------------------------positive---"+positive);
				   
				   System.out.println("----------------------------------------negative---"+negative);
				   
				   System.out.println("----------------------------------------neutral---"+neutral);
			
				     positive1=positive;
					  negative1=negative;
					  neutral1=neutral;
				   
				   if(m==0)
				   {
					   
					   assigncount.add(checknoun.get(i));
				   }
					   System.out.println();
					
					
				   }
				  
				
				  
			  }
			  
			 
			  
				   for(int i=0;i<assigncount.size();i++)
				   {
					   
					   
							  if(positive>negative)  
								{
								  
								  
								  ArrayList<String> m_words=new ArrayList<String>();
								  m_words =AdminDAO.checkw_words();
					   
					  for(int q=0;q<m_words.size();q++)
					  {
								  System.out.println(">>>>>>>>>>>>>>>m_words1>>>>>>>>>>>>>>>>>>>>>>>"+m_words.get(q));  
								  String[] splittedline=m_words.get(q).split("-");
						
						  for (int i1 = 0; i1 < splittedline.length; i1++) 
						  {
						      
							 
							  System.out.println("splitted line is >>>>>>>>>>>>>>>>>>>>>>>>>>>"+splittedline[i1]);
							  
							  if(splittedline[i1].contains(assigncount.get(i)))
							  {
										String 	 datam_word= AdminDAO.getparticularw_word(m_words.get(q));
										
										System.out.println("particular m_word is"+datam_word);
										//checknoun.add( 2, "New" );
										assigncount.set( i, datam_word );
							
							//newlist.add(datam_word);
								  
							  }
							  else
							  {
								  
								// System.out.println("remaing words>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+checknoun.get(i)); 
								  
							  }
							  
							  
							  
							  
						  }
						 
						  
					  }
					  
					  
					  
					  
						flag77=AdminDAO.insertSecondExpKeywordpositive(assigncount.get(i),datas);
						
						
						
						
						
						
					}
					else if(positive<negative)
					{
						
						 ArrayList<String> m_words=new ArrayList<String>();
						  m_words =AdminDAO.checkw_words();
						   
						  for(int q=0;q<m_words.size();q++)
						  {
							  System.out.println(">>>>>>>>>>>>>>>m_words1>>>>>>>>>>>>>>>>>>>>>>>"+m_words.get(q));  
							  String[] splittedline=m_words.get(q).split("-");
							
							  for (int i1 = 0; i1 < splittedline.length; i1++) 
							  {
							      
								 
								  System.out.println("splitted line is >>>>>>>>>>>>>>>>>>>>>>>>>>>"+splittedline[i1]);
								  
								  if(splittedline[i1].contains(assigncount.get(i)))
								  {
										String 	 datam_word= AdminDAO.getparticularw_word(m_words.get(q));
										
										System.out.println("particular m_word is"+datam_word);
										//checknoun.add( 2, "New" );
										assigncount.set( i, datam_word );
								
								//newlist.add(datam_word);
									  
								  }
								  else
								  {
									  
									// System.out.println("remaing words>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+checknoun.get(i)); 
									  
								  }
								  
								  
								  
								  
							  }
							 
							  
						  }
						  
						
						flag77=AdminDAO.insertSecondExpKeywordnegative(assigncount.get(i),datas);
						
						
						
					}
				  
					else if(positive==negative)
					{
						
						
						
						
						 ArrayList<String> m_words=new ArrayList<String>();
						  m_words =AdminDAO.checkw_words();
						   
						  for(int q=0;q<m_words.size();q++)
						  {
							  System.out.println(">>>>>>>>>>>>>>>m_words1>>>>>>>>>>>>>>>>>>>>>>>"+m_words.get(q));  
							  String[] splittedline=m_words.get(q).split("-");
							
							  for (int i1 = 0; i1 < splittedline.length; i1++) 
							  {
							      
								 
								  System.out.println("splitted line is >>>>>>>>>>>>>>>>>>>>>>>>>>>"+splittedline[i1]);
								  
								  if(splittedline[i1].contains(assigncount.get(i)))
								  {
								String 	 datam_word= AdminDAO.getparticularw_word(m_words.get(q));
								
								System.out.println("particular m_word is"+datam_word);
								//checknoun.add( 2, "New" );
								assigncount.set( i, datam_word );
								
								//newlist.add(datam_word);
									  
								  }
								  else
								  {
									  
									// System.out.println("remaing words>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+checknoun.get(i)); 
									  
								  }
								  
								  
								  
								  
							  }
							 
							  
						  }
						  
						flag77=AdminDAO.insertSecondExpKeywordneutral(assigncount.get(i),datas);	
						
						
						
					}
				   
					}
				  
				   
				   
				   
				   
				   if(positive>negative || positive > neutral)
					  {
						  String pos="positive";
					  AdminDAO.insertmtweets(pos,tweetsid.get(j));
					  }
					  
					  if(negative>positive || negative > neutral)
					  {
						  String neg="negative";
						  AdminDAO.insertmtweets(neg,tweetsid.get(j));  
					  }
					  if(positive==negative)
					  {

						  String neu="neutral";
						  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
					  }
					  
					  if(neutral>positive || neutral > negative)
					  {
						  String neu="neutral";
						  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
					  }
					  
					  if(neutral==positive) 
					  {
						  String neu="positive";
						  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
					  }
					  
					  if(neutral==negative) 
					  {
						  String neu="negative";
						  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
					  }
					
					
				   
		      }
			
			
			 System.out.println("positive1 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+positive1);
			  System.out.println("negative1 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+negative1);
			  System.out.println("neutral1 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+neutral1);
			 
			   if(positive1>negative1 )
				  {
					  String pos="positive";
				   AdminDAO.insertmtweets(pos,tweetsid.get(j));
				  }
				  
				  if(negative1>positive1 )
				  {
					  String neg="negative";
					  AdminDAO.insertmtweets(neg,tweetsid.get(j));  
				  }
				  if(positive1==negative1)
				  {

					  String neu="neutral";
					  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
				  }
				  
				  if(negative1>neutral1 )
				  {
					  String neu="negative";
					  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
				  }
				  
				 /* if(neutral1==positive1) 
				  {
					  String neu="positive";
					  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
				  }
				  
				  if(positive1>neutral1) 
				  {
					  String neu="positive";
					  AdminDAO.insertmtweets(neu,tweetsid.get(j));   
				  }
			*/
				 
			
	        }
			 
			 boolean posflag=false;
			 boolean negflag=false;
			 boolean nueflag=false;
			
			 Thread.sleep(1000);
			   ArrayList<String> positivenewwords=new ArrayList<String>();
			   ArrayList<String> neagtivenewwords=new ArrayList<String>();
			   ArrayList<String> neutralnewwords=new ArrayList<String>();
			   String Treshold=Utility.getPro("Treshold");
			   
			   int thre=Integer.parseInt(Treshold);
			  positivenewwords=   AdminDAO.secondexpansionpos_words(thre);
			  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>positivewordexpansion>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+positivenewwords);
			  
			  for(int i=0; i<positivenewwords.size();i++)
			  {
				  String expan_key=positivenewwords.get(i);
				posflag=  AdminDAO.insertsensitivepositive(expan_key,datas);
				  if(posflag)
				  {
					  
					 AdminDAO.deleteposexkeywords(expan_key);
					  
				  }
				  
				  
				  
			  }
			
			   
			  neagtivenewwords=   AdminDAO.secondexpansionneg_words(thre);
			  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>neagtivenewwords>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+neagtivenewwords);
			
			  for(int i=0; i<neagtivenewwords.size();i++)
			  {
				  String expan_key=neagtivenewwords.get(i);
				  negflag=	  AdminDAO.insertsensitivenegative(expan_key,datas);
				  
				  
				  
				  if(negflag)
				  {
					  
					 AdminDAO.deleteposexkeywords(expan_key);
					  
				  }
			  }
			
			  neutralnewwords=   AdminDAO.secondexpansionneu_words(thre);
			
			   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>neutralnewwords>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+neutralnewwords);
		
			   for(int i=0; i<neutralnewwords.size();i++)
				  {
					  String expan_key=neutralnewwords.get(i);
					  nueflag= AdminDAO.insertsensitiveneural(expan_key,datas);
					  
					  
					  
					  
					  if(nueflag)
					  {
						  
						 AdminDAO.deleteposexkeywords(expan_key);
						  
					  }
				  }
			   
			   
			   
				
			RequestDispatcher rd=null;
			if(flag77==true)
			{
				
				rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=3");
				rd.forward(request,response);
			}
			else
			{
				
				rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=4");
				rd.forward(request,response);
			}       	
			
			
			
		} 
		}catch (SQLException | IOException | ServletException | InterruptedException e) {
		
			e.printStackTrace();
		}
		 
		 
		
	}
	
	
	}