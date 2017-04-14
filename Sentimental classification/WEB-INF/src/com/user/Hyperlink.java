package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hyperlink {
	
	public static void  main(String srgs[])
	
	
	{
		String commentstr="  shanu    http://www.google.co.in/webhp    shanu";
		
		Hyperlink hyperlink=new Hyperlink();
		hyperlink.removeUrl(commentstr);
		
	}
	public  String removeUrl(String commentstr)
    {
        String urlPattern = "((https?|ftp|gopher|telnet|file|Unsure|http):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
        Pattern p = Pattern.compile(urlPattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(commentstr);
        int i = 0;
        while (m.find()) {
            commentstr = commentstr.replaceAll(m.group(i),"").trim();
            i++;
        }
        System.out.println("remaining data is"+commentstr);
        return commentstr;
    }
}
