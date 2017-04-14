package com.mycompany.logic;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;







public class AdminDAO
{
	
	public static boolean checkUser(String user, String pass) throws SQLException
	{
		
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select * from user where username='"+user+"' and password='"+pass+"'";
		ResultSet rs;
		Connection c1 = null;
		DataBaseConnectionPool dbConnectionPool = null;
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				flg = true;
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	}
	
	
	
	
	
	public static boolean check(String wor) throws SQLException
	{
		
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select * from t_word where f_word='"+wor+"'";
		ResultSet rs;
		Connection c1 = null;
		DataBaseConnectionPool dbConnectionPool = null;
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				flg = true;
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	}
	
	public static boolean  storeintodatabaseapple(String part1,String part3, String part4, String s) 
	
	{
			java.sql.PreparedStatement pstmt = null;
			
			String select_sql = "insert into applefilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
			
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				dbConnectionPool.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;

}
	
	public static boolean storeintodatabasetwitter(String part1,String part3, String part4, String s) 
	{
			java.sql.PreparedStatement pstmt= null;
			
			String select_sql ="insert into tweeterfilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();
				
				
				System.out.println("Admin Login Status : " + flg);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;
			
}
	public static boolean storeintodatabasemicrosoft(String part1,String part3, String part4, String s) 
	
	{

		java.sql.PreparedStatement pstmt = null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into microsoftfilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;

}
	public static boolean storeintodatabasegoogle(String part1,String part3, String part4, String s) 
	
	{
		
		java.sql.PreparedStatement pstmt= null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into googlefilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";

		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("Admin Login Status : " + flg);
		} catch (Exception e) {
			
			e.printStackTrace();
			
					}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	

}





	public static boolean storeoriginalcontents(String part1, String part2,
			String part3)
{
		System.out.println("its came into Admindao");
		java.sql.PreparedStatement pstmt= null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into tweets(topic,tweetId,tweettext) values('"+part1+"','"+part2+"','"+part3+"')";
		System.out.println("insert query is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+select_sql);

		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("tweets inserted is true : " + flg);
		} catch (Exception e) {
			
			e.printStackTrace();
			
					}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
}

	public static HashMap<Integer, ArrayList<String>> gettweets()
	{

		
		java.sql.PreparedStatement pstmt;
		String select_sql = "select topic,sentiment,tweetId,tweetdate,tweettext from tweets";
		System.out.println("sql :"+select_sql);
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;

		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  
				 
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			 System.out.println("row count is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+rowcount);
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					//String list1="list"+i;
					ArrayList<String> list =new ArrayList<String>();
					
					list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5));
					
					
					
					
					map.put(i, list);
					i=i+1;
					
					
				}
				
				
				
				
			}
			int j=1;
			
			
			while(j<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				
				
				
				
				
				map.get(j);
				System.out.println("Get Value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map.get(j));
				j=j+1;
				
				
			}
			
			System.out.println("i is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+i);
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			System.out.println("Exception in AdminDAO ==> getPayType() : ");
			e.printStackTrace();
		}

		return map;
	}





















public static boolean  storefiltereddata(String part1,String part2, String part3, String part4,String s) 
	
	{
			java.sql.PreparedStatement pstmt = null;
			
			String select_sql = "insert into m_tweet_keywords(topic,sentiment,tweetId,tweetdate,tweettext) values('"+part1+"','"+part2+"','"+part3+"','"+part4+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
			
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				dbConnectionPool.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;

}



public static ArrayList<String> getfilteddata(String id) throws SQLException
{
	ArrayList<String> data=new ArrayList<String>();
	//String data="";
	java.sql.PreparedStatement pstmt = null;
	String select_sql = "select tweettext from m_tweet_keywords where id='"+id+"'";
	ResultSet rs;
	Connection c1 = null;
	
	DataBaseConnectionPool dbConnectionPool = null;
	
	boolean flg = false;
	try
	{
		System.out.println(select_sql);
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	 c1 = dbConnectionPool.getConnection();
		
		if(c1==null)
		{
			c1 = dbConnectionPool.getConnection();
		}
		pstmt = c1.prepareStatement(select_sql);
		System.out.println("testomg pstmt");
		rs = pstmt.executeQuery();
		System.out.println("testomg rs");
		while (rs.next()) 
		{
			data.add(rs.getString(1));
		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return data;

}


public static boolean  checkNoun(String splitword) 

{
		java.sql.PreparedStatement pstmt = null;
		
		String select_sql = "select * from m_noun where noun='"+splitword+"'";
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;

}





public static String checksensitivewords(String string,String datas) {
	
	{
		
		
		System.out.println("topic came inside the AdminDAO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+datas);
		java.sql.PreparedStatement pstmt = null;
		String data="";
		String leftkeyword="";
		String select_sql = "select type from m_sensitive_keywords where keywords='"+string+"' AND   topic='"+datas+"' " ;
		
		
		String select_sql1 = "select * from m_sensitive_keywords where keywords='"+string+"'";
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			pstmt = c1.prepareStatement(select_sql1);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				k=1;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		StringBuffer sb=new StringBuffer();
		sb.append(data);
		sb.append("~~");
		sb.append(k);
		return sb.toString();

}



}





public static boolean insertSecondExpKeywordpositive(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int pos=1;
	int neg=0;int neu=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,positive,negative,neutral) values('"+string+"','"+topic+"','"+pos+"','"+neg+"','"+neu+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int positive=0;
			
			String select_sql3 = "select positive from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				positive=rs.getInt(1);

			}
			
			pstmt.close();
			positive++;
			
			String select_sql2 = "update m_expand_keywords set positive='"+positive+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}




public static boolean insertSecondExpKeywordnegative(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int neg=1; int pos=0;int nue=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,negative,positive,neutral) values('"+string+"','"+topic+"','"+neg+"','"+pos+"','"+nue+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int negative=0;
			
			String select_sql3 = "select negative from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				negative=rs.getInt(1);

			}
			
			pstmt.close();
			negative++;
			
			String select_sql2 = "update m_expand_keywords set negative='"+negative+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}




public static boolean insertSecondExpKeywordneutral(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int neutral=1; int pos=0;int neg=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,neutral,negative,positive) values('"+string+"','"+topic+"','"+neutral+"','"+pos+"','"+neg+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int neu=0;
			
			String select_sql3 = "select neutral from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				neu=rs.getInt(1);

			}
			
			pstmt.close();
			neu++;
			
			String select_sql2 = "update m_expand_keywords set neutral='"+neu+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}



public static ArrayList<String> secondexpansionpos_words(int thre) {
	
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where positive>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;

}



}





public static ArrayList<String> secondexpansionneg_words(int thre) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where negative>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;






	}





	}











public static ArrayList<String> secondexpansionneu_words(int thre) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where neutral>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;



	}


}





public static boolean insertsensitivepositive(String expan_key,String topic) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		//String topic="apple";
		String pos="positive";
		String iteration="expansion";
		
		
		String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+pos+"','"+expan_key+"','"+iteration+"')";
		
		int i=0;
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			 i=pstmt.executeUpdate();
			if(i>0)
			{
				flg=true;
			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return flg;



	}

}





public static boolean insertsensitivenegative(String expan_key,String topic) {
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	//String topic="apple";
	String neg="negative";
	String iteration="expansion";
	
	
	String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+neg+"','"+expan_key+"','"+iteration+"')";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;

}





public static boolean insertsensitiveneural(String expan_key,String topic) {
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	//String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+neu+"','"+expan_key+"','"+iteration+"')";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}





public static boolean deleteposexkeywords(String expan_key) {
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "delete from m_expand_keywords where expand_keyword='"+expan_key+"'";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}





public static boolean insertmtweets(String pos,String id) {
	
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "update tweets set our_detectedsentiment='"+pos+"' where id='"+id+"'";	
	System.out.println("UPDATE============="+select_sql);
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
	
	
	
	
}





public static ArrayList<String> gettweetsid()
{
	ArrayList<String> data=new ArrayList<String>();
	//String data="";
	java.sql.PreparedStatement pstmt = null;
	String select_sql = "select id from m_tweet_keywords";
	ResultSet rs;
	Connection c1 = null;
	
	DataBaseConnectionPool dbConnectionPool = null;
	
	boolean flg = false;
	try
	{
		System.out.println(select_sql);
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	 c1 = dbConnectionPool.getConnection();
		
		if(c1==null)
		{
			c1 = dbConnectionPool.getConnection();
		}
		pstmt = c1.prepareStatement(select_sql);
		System.out.println("testomg pstmt");
		rs = pstmt.executeQuery();
		System.out.println("testomg rs");
		while (rs.next()) 
		{
			data.add(rs.getString(1));
		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return data;
}



	public static HashMap<Integer, ArrayList<String>> getdetectedsentiment()
	{

		
		java.sql.PreparedStatement pstmt;
		String select_sql = "select * from tweets";
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;

		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					//String list1="list"+i;
					ArrayList<String> list =new ArrayList<String>();
					
					list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(6)+"~~"+rs.getString(7));
					
					
					
					
					map.put(i, list);
					i=i+1;
				}
				
				
			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return map;
	}





	public static String gettopic(String string) {
		String datas="";
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select topic from m_tweet_keywords where id='"+string+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;


}





	public static String fetchkeywords(String sentype) {
		String datas="";
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select keywords from m_sensitive_keywords where type='"+sentype+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;

}





	public static ArrayList<String> checkw_words() {
		ArrayList<String> datas =new ArrayList<String>();
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select w_words from m_word";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas.add(rs.getString(1));
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;

}





	public static String getparticularw_word(String string) {
		
		
		
		System.out.println("remaining word is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+string);
		
		ArrayList<String> datas =new ArrayList<String>();
		String datass="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select w_word from m_word where w_words='"+string+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datass=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datass;

		
		
		
		
		
	}
}