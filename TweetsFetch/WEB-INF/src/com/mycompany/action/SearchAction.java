package com.mycompany.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.struts2.ServletActionContext;

import com.mycompany.logic.TwitterRestCall;
import com.mycompany.vo.FileListVo;
import com.mycompany.vo.SearchVo;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction {
	private List<SearchVo> searchDetails;
	private String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<SearchVo> getSearchDetails() {
		return searchDetails;
	}

	public void setSearchDetails(List<SearchVo> searchDetails) {
		this.searchDetails = searchDetails;
	}

	private TwitterRestCall twitterRestCall;

	public String execute() {
		ServletContext context = ServletActionContext.getServletContext();
		String filePath = context.getRealPath("") + "/" + "config.properties";
		twitterRestCall = new TwitterRestCall(filePath);
		searchDetails = twitterRestCall.getTweetSearch(filePath, search);
		
		return ActionSupport.SUCCESS;
	}
}
