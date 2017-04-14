package com.mycompany.action;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	
     public static void main(String[] args) {

	JSONParser parser = new JSONParser();

	try {

		Object obj = parser.parse(new FileReader("C:\\search.json"));

		JSONObject jsonObject = (JSONObject) obj;

		String name = (String) jsonObject.get("text");
		System.out.println(name);

		/*String name1 = (String) jsonObject.get("name");
		System.out.println(name1);

		// loop array
		JSONArray msg = (JSONArray) jsonObject.get("description");
		Iterator<String> iterator = msg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());}*/
		

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}

     }

}