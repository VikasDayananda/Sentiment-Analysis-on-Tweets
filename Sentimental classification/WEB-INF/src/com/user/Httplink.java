package com.user;



	public class Httplink
	{
		public static void main(String[] args) 
		{
			String s="#Google #Nexus press conference http://t.co/2WV01o5v #slick";
			
			String tt[]=s.split("http");
			
			int spos=s.indexOf("http");
		
			
			String y=s.substring(spos);
			
			int epos=spos+y.indexOf(" ");
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+y);
			
			spos=0;
			
			StringBuffer sb=new StringBuffer(s);
			
			sb=sb.delete(spos, epos);
			System.out.println(tt[0]+sb);
			
			
		}
	}
