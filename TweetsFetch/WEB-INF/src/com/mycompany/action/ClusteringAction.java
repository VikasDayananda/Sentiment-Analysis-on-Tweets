package com.mycompany.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.struts2.ServletActionContext;

import com.mycompany.logic.ClusteringLogic;
import com.mycompany.logic.HiveClientCall;
import com.mycompany.vo.FileListVo;
import com.mycompany.vo.HashTagVo;
import com.mycompany.vo.LocationVo;
import com.mycompany.vo.RetweetCountVo;
import com.opensymphony.xwork2.ActionSupport;

public class ClusteringAction {
	private List<RetweetCountVo> retweetList;
	private String mode;

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<RetweetCountVo> getRetweetList() {
		return retweetList;
	}

	public void setRetweetList(List<RetweetCountVo> retweetList) {
		this.retweetList = retweetList;
	}

	ClusteringLogic clusteringLogic = new ClusteringLogic();
	private List<LocationVo> locationList;

	private List<HashTagVo> hashTagList;
	

	public List<HashTagVo> getHashTagList() {
		return hashTagList;
	}

	public void setHashTagList(List<HashTagVo> hashTagList) {
		this.hashTagList = hashTagList;
	}

	public List<LocationVo> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<LocationVo> locationList) {
		this.locationList = locationList;
	}

	public String execute() throws Exception {
		ServletContext context = ServletActionContext.getServletContext();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String filePath = session.getServletContext().getRealPath("") + "/"
				+ "config.properties";
		FileInputStream fileInputStream = new FileInputStream(
				new File(filePath));
		Properties properties = new Properties();
		properties.load(fileInputStream);
		Configuration conf = new Configuration();
		conf.addResource(new Path(properties.getProperty("hadoopLoc")));
		FileSystem fs = FileSystem.get(conf);
		Path pt = new Path(properties.getProperty("hdfsLoc"));
		FileStatus[] status = fs.listStatus(pt);
		String dest = session.getServletContext().getRealPath("") + "/"
				+ "result";
		for (int i = 0; i < status.length; i++)
		{
			if (!status[i].isDir()) {
				
				Path src = new Path(status[i].getPath().toString());
				FileListVo fileListVo=new FileListVo();
				fileListVo.setFileName(src.getName());
				Path destination = new Path(dest);
				fs.copyToLocalFile(src, destination);
			}
			
		}
		
	
		if (mode.equals("search") || mode.equals("search" +
				"") )
		{
			hashTagList = clusteringLogic.HashTagServices(session.getServletContext().getRealPath(""));
		}
		else if(mode.equals("Google") || mode.equals("google") )
		{
			hashTagList = clusteringLogic.HashTagServices(session.getServletContext().getRealPath(""));
		}
		else if(mode.equals("microsoft") || mode.equals("microsoft") )
		{
			hashTagList = clusteringLogic.HashTagServices(session.getServletContext().getRealPath(""));
		}
		else if(mode.equals("retweet"))
		{
			retweetList=clusteringLogic.retweetCountServices(session.getServletContext().getRealPath(""));
		}
		return ActionSupport.SUCCESS;
	}
}
