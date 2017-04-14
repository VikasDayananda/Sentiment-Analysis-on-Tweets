
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOFactory.User;

public class DownloadFiles extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		ResultSet rs = null;
		RequestDispatcher rd=null;
		

		
		String username = "";
		int userid ;
		HttpSession session = null;
	
		session = req.getSession();

	    if(session != null)
	    {
	    	username = session.getAttribute("userid").toString();
	    }
		
	    System.out.println("User Name :"+username);
	    userid = User.getDataOwnerId(username);
	    
	    HttpSession hs=req.getSession();
	    hs.setAttribute("userid", username);
		
		try 
		{
			rs = User.getFiles();
			
			if(rs != null)
			{
				req.setAttribute("rs", rs);
				rd=req.getRequestDispatcher("/Files/JSP/User/download_file.jsp?no=0 ");
				rd.forward(req, resp);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Opps,Error in DownloadFiles Servlet : ");
			e.printStackTrace();
		}
		
		
		
	}
}
