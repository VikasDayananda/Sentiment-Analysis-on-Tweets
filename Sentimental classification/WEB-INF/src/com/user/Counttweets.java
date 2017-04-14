package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Counttweets extends HttpServlet {
	
	boolean flag=true;
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
		String topic=req.getParameter("resultprcs");
		String pos="positive";
		String neg="negative";
		String neu="neutral";
		 int positivecount = AdminDAO.getpositivecount(topic,pos);
		
		 int negativecount = AdminDAO.getnegativecount(topic,neg);
		
			 int neutralcount = AdminDAO.getneuralcount(topic,neu);
				
				
				if(flag==true)
				{
					System.out.println("its came inside if block");
					
					if(negativecount>positivecount & negativecount>neutralcount)
							{
					RequestDispatcher rd=req.getRequestDispatcher("/Files/JSP/User/reviewResult.jsp?no=3&nmark="+negativecount+"&neumrk="+neutralcount+"&pmark="+positivecount+"");
					try {
						rd.forward(req, res);
					} catch (ServletException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
							}
					else if(negativecount<positivecount & positivecount>neutralcount)
					{
			RequestDispatcher rd=req.getRequestDispatcher("/Files/JSP/User/reviewResult.jsp?no=1&nmark="+negativecount+"&neumrk="+neutralcount+"&pmark="+positivecount+"");
			try {
				rd.forward(req, res);
			} catch (ServletException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
					}
					else
					{
						RequestDispatcher rd=req.getRequestDispatcher("/Files/JSP/User/reviewResult.jsp?no=2&nmark="+negativecount+"&neumrk="+neutralcount+"&pmark="+positivecount+"");
						try {
							rd.forward(req, res);
						} catch (ServletException e) {
							
							e.printStackTrace();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
					}
					
				}
		
	}

}
