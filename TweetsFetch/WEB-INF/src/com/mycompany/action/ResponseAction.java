package com.mycompany.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.mycompany.logic.JsonConverter;
import com.mycompany.vo.ResponseVo;
import com.opensymphony.xwork2.ActionSupport;

public class ResponseAction 
{
	private JsonConverter jsonConverter;
	private String ids;
	private List<ResponseVo> responseList;
	ArrayList<String> list=new ArrayList<>();
	
	
	public List<ResponseVo> getResponseList()
	{
		return responseList;
	}

	public void setResponseList(List<ResponseVo> responseList) 
	{
		this.responseList = responseList;
	}

	public String getIds() 
{
		return ids;
	}

	public void setIds(String ids)
	{
		this.ids = ids;
	}

	public  String execute(String id)
	{
		jsonConverter=new JsonConverter();
		ServletContext context = ServletActionContext.getServletContext();
		String filePath = context.getRealPath("")+"/result/search.json";
		System.out.println("==========FILENAME===="+filePath);
		System.out.println("ids ::" + id);
		
		
		responseList=jsonConverter.getResponseVos(filePath, id);
		//responseList=jsonConverter.getResponseVos1(filePath, id);
		
		for(int i=0;i<responseList.size();i++)
		{
			System.out.println("+=======RES================"+ responseList.get(i));
			
		}
		return ActionSupport.SUCCESS;
	}
}
