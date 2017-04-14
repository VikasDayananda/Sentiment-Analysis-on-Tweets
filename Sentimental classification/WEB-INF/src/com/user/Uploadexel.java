package com.user;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.DAOFactory.CommonDAO;
import com.user.AdminDAO;

import com.util.Utility;

public class Uploadexel extends HttpServlet
{
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	
			throws IOException 
			{
		PrintWriter out = response.getWriter();
		try {
			
			boolean flag11=false;
			boolean flag22=false;
			boolean flag33=false;
			
			boolean flag44=false;
			String fileName = "", root = "", md = "", dir = "cloud_iseive",root1 = "",root2="";
			String status; 
			String[] name = new String[2];
			int i = 0;
			File uploadedFile = null;
			File uploadedFile1=null;
			ResultSet rs = null;
			boolean flag = false;
			boolean flag_upload = false;
			RequestDispatcher rd = null;
			Random random = new Random();
			int num, num1 = 0;
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			String name1=request.getParameter("name");
			System.out.println("value of name1 is  "+name1);
			//String grpname=CommonDAO.getGroupName(name1);

	
	
	if (isMultipart)
	{
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		try 
		{
			
			List items = upload.parseRequest(request);
			Iterator iterator = items.iterator();
			while (iterator.hasNext())
			{
				FileItem item = (FileItem) iterator.next();
				if (item.isFormField())
				{
					name[i] = item.getString();
					i++;
				} 
				else 
				{
					fileName = item.getName();
					System.out.println("filename iss" + fileName);
					root = getServletContext().getRealPath("/Upload");
					
					
					uploadedFile = new File(root +"/"+fileName);
					
					System.out.println("Directory name iss" + uploadedFile);
					item.write(uploadedFile);
				}
			}
		}
		
	catch (Exception e) {
	
	}
	}
	
	
		ArrayList data=new ArrayList();
		String memb_code=null;
		String policy_mem_code="AB";
		int row11=0;
		FileInputStream file=null;
		XSSFWorkbook workbook=null;
		int i1=0;
		try
		{
		file = new FileInputStream(new File(root +"/"+fileName));
			 workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			for(Row row : sheet) 
			{
				StringBuffer sb1= new StringBuffer();
         if(i1==0)
					
				{
				
				 row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) 
				{
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) 
					{
						case Cell.CELL_TYPE_NUMERIC:
							break;
						case Cell.CELL_TYPE_STRING:
							break;
					}
				}
				i1=1;	
			  }
               else{
				   for(int cn=0; cn<6; cn++) 
				   {
				       
				       Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
				       // Print the cell for debugging
				       System.out.println("CELL: " + cn + " --> " + cell.toString());
				       
				       if (cn==0||cn==1||cn==2||cn==3||cn==4||cn==5)
				       {
				    	   if(cell.toString().isEmpty())
				    	   {
				    		   sb1.append("null");
				    	   }
				       }
				       sb1.append(cell.toString());
				       sb1.append("~~");
				       
				   }
				   StringBuffer buf = null;
				   String ss=sb1.toString();
			        // System.out.println("||||||||||||||||||||||||||||||||||||||||||||"+ss);
			         String[] splits = ss.split("~~");
			         
			         String part1 = splits[0]; 
			         String part2 = splits[1]; 
			         String part3 = splits[2];
						String part4 = splits[3];
						String part5 = splits[4];
						
						System.out.println("the excell data is"+part5);
						ArrayList list=new ArrayList();
						
						list=Preprocessing1.filter(part5);
						String str=""+list;
						list.add(str);
						for(int ii=0;ii<list.size();ii++)
						{
							buf=new StringBuffer();
							buf.append(list.get(ii));
						}
						
						String s=buf.toString();
						if(part1.equals(null))
						{
							
						}
						else
						{
						
						if(part1.equals("apple"))
						{
					    	flag11= AdminDAO.storeintodatabaseapple(part1, part3, part4, s);
					    	
						}
					
						if(part1.equals("google"))
						{
							flag22= AdminDAO.storeintodatabasegoogle(part1, part3, part4, s);
						}
						
						if(part1.equals("microsoft"))
						{
							flag33=AdminDAO.storeintodatabasemicrosoft(part1, part3, part4, s);
						}
						
						if(part1.equals("twitter"))
						{
							flag44=AdminDAO.storeintodatabasetwitter(part1, part3, part4, s);
						}
						}	
						
						
						
               }
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		if(flag11 && flag22 && flag33 && flag44 )
		{
			
			rd=request.getRequestDispatcher("/Files/JSP/User/upload_file.jsp?no1=1");
			rd.forward(request,response);
		}
		else
		{
			
			rd=request.getRequestDispatcher("/Files/JSP/User/upload_file.jsp?no=0&no1=2");
			rd.forward(request,response);
		}
				
		
		
		
		
	}
	
	
	catch (Exception e) {
		// TODO: handle exception
	}
	
			}
}
