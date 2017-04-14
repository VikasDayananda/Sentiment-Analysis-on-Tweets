package com.mycompany.logic;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.mycompany.vo.ResponseVo;
import com.mycompany.vo.SearchVo;

public class JsonConverter {
	public void convertTrendsValue(String fileName) {
		try {
			JSONParser parser = new JSONParser();
			FileInputStream fileInputStream = new FileInputStream(new File(
					fileName));
			byte[] byt = new byte[fileInputStream.available()];
			fileInputStream.read(byt);
			String s = new String(byt);
			try {
				Object obj = parser.parse(s);
				JSONArray array = (JSONArray) obj;
				JSONObject obj2 = (JSONObject) array.get(0);
				JSONArray trends = (JSONArray) obj2.get("trends");
				for (int i = 0; i < trends.size(); i++) {
					JSONObject jsonObject = (JSONObject) trends.get(i);
					Vector<String> rowData = new Vector<String>();
					rowData.add(jsonObject.get("name").toString());
					rowData.add(jsonObject.get("url").toString());
					/*
					 * MainForm.defaultTableModel.addRow(rowData);
					 * MainForm.jComboBox.addItem(jsonObject.get("name")
					 * .toString());
					 */
				}
			} catch (Exception pe) {
				pe.printStackTrace();
			} finally {
				fileInputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<SearchVo> convertSearchValue(String fileName) {
		List<SearchVo> searchDetails = new ArrayList<SearchVo>();
		try {

			JSONParser parser = new JSONParser();
			FileInputStream fileInputStream = new FileInputStream(new File(
					fileName));
			byte[] byt = new byte[fileInputStream.available()];

			fileInputStream.read(byt);
			String s = new String(byt);
			try {
				Object obj = parser.parse(s);
				JSONObject jsonObject = (JSONObject) obj;
				JSONArray trends = (JSONArray) jsonObject.get("statuses");
				System.out.println(trends.size());
				for (int i = 0; i < trends.size(); i++) {
					JSONObject jsObject = (JSONObject) trends.get(i);
					JSONObject jObject = (JSONObject) jsObject.get("user");
					SearchVo searchVo = new SearchVo();
					searchVo.setId(jObject.get("id").toString());
					searchVo.setName(jObject.get("name").toString());
					searchVo.setScreenName(jObject.get("screen_name")
							.toString());
					searchVo.setScreenName(jObject.get("screen_name")
							.toString());
					searchVo.setText(jsObject.get("text").toString());
					searchVo.setCreatedDate(jsObject.get("created_at")
							.toString());
					searchDetails.add(searchVo);
				}

			} catch (Exception pe) {
				pe.printStackTrace();
			} finally {
				fileInputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchDetails;
	}

	public void convertAggregationValue(String fileName) {
		try {
			JSONParser parser = new JSONParser();
			FileInputStream fileInputStream = new FileInputStream(new File(
					fileName));
			byte[] byt = new byte[fileInputStream.available()];

			fileInputStream.read(byt);
			String s = new String(byt);
			try {
				Object obj = parser.parse(s);
				JSONObject jsonObject = (JSONObject) obj;
				JSONArray trends = (JSONArray) jsonObject.get("statuses");
				System.out.println(trends.size());
				/*
				 * JSONObject jsObject = (JSONObject) trends .get(trends.size()
				 * - 1); String inTime = jsObject.get("created_at").toString();
				 * jsObject = (JSONObject) trends.get(0); String outTime =
				 * jsObject.get("created_at").toString(); int retweet_count = 0;
				 */

			} catch (Exception pe) {
				pe.printStackTrace();
			} finally {
				fileInputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public List<>
	public List<ResponseVo> getResponseVos(String filePath, String ids) {
		List<ResponseVo> responseList=new ArrayList<ResponseVo>();
		try {
			JSONParser parser = new JSONParser();
			FileInputStream fileInputStream = new FileInputStream(new File(
					filePath));
			byte[] byt = new byte[fileInputStream.available()];
			
			fileInputStream.read(byt);
			String s = new String(byt);

			try {
				Object obj = parser.parse(s);
				JSONObject jsonObject = (JSONObject) obj;
				JSONArray trends = (JSONArray) jsonObject.get("statuses");
				for (int i = 0; i < trends.size(); i++) {
					JSONObject jsObject = (JSONObject) trends.get(i);
					JSONObject jObject = (JSONObject) jsObject.get("user");
					JSONObject hashEntity = (JSONObject) jsObject
							.get("entities");
					JSONArray hash_trends = (JSONArray) hashEntity
							.get("hashtags");
					if (ids.contains(jsObject.get("id").toString())) 
					{
						ResponseVo responseVo = new ResponseVo();
						responseVo.setId(jsObject.get("id").toString());
						System.out.println("=======================JASON ID+++++++++++++++"+jsObject.get("id").toString());
						responseVo.setText(jsObject.get("text").toString());
						
						System.out.println("=======================JASON TEXT+++++++++++++++"+jsObject.get("text").toString());
						
						HttpServletRequest request1 = ServletActionContext.getRequest();
						HttpServletResponse response1=ServletActionContext.getResponse();
						HttpSession session = request1.getSession();
					    String topic=session.getAttribute("data").toString();
					    System.out.println("session data is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+topic);
						
						boolean flag1=AdminDAO.storeoriginalcontents(topic,jsObject.get("id").toString(),jsObject.get("text").toString());
						if(flag1)
						{
							RequestDispatcher rd=null;
							rd=request1.getRequestDispatcher("user_home.jsp");
							rd.forward(request1, response1);
							 
						}
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>flag1 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+flag1);
					//	responseVo.setName(jObject.get("name").toString());
					//	responseVo.setCreatedAt(jsObject.get("created_at")
						//		.toString());
					//	responseVo.setLocation(jObject.get("location")
							//	.toString());
					//	responseVo.setRetweetCount(jsObject
					//			.get("retweet_count").toString());
						String hashTag = "";
						for (int hash_index = 0; hash_index < hash_trends
								.size(); hash_index++) 
						{
							JSONObject hashObject = (JSONObject) hash_trends
									.get(hash_index);
							if (hashTag.equals(""))
								hashTag = hashObject.get("text").toString();
							else 
							{
								hashTag += ","
										+ hashObject.get("text").toString();
							}
						}
						responseVo.setHashTag(hashTag);
						responseList.add(responseVo);
					}
					
				}

			} catch (Exception pe) {
				pe.printStackTrace();
			} finally {
				fileInputStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseList;
	}

	public static void main(String[] args) {
		JsonConverter jsonConverter = new JsonConverter();
		jsonConverter.convertAggregationValue("result.json");
	}
}
