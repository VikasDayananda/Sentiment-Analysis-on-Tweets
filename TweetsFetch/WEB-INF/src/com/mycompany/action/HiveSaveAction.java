package com.mycompany.action;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class HiveSaveAction {
	public String execute() {
		ServletContext context = ServletActionContext.getServletContext();
		String filePath = context.getRealPath("") + "/" + "config.properties";
		try {
			filePath = context.getRealPath("") + "/" + "config.properties";
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			Properties properties = new Properties();
			properties.load(fileInputStream);

			Configuration conf = new Configuration();
			conf.addResource(new Path(properties.getProperty("hadoopLoc")));
			FileSystem fs = FileSystem.get(conf);
			Path pt = new Path(properties.getProperty("hdfsLoc"));
              System.out.println("============SSSSSSSSSS==========");
			Path src = new Path(context.getRealPath("") + "/result/search.json");
			fs.copyFromLocalFile(src, pt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ActionSupport.SUCCESS;
	}
}
