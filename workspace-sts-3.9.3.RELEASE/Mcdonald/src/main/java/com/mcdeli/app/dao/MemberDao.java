package com.mcdeli.app.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	public Object getObject(Object dataMap) {
		Map<String, Object> resultObject=new HashMap<String,Object>();
		resultObject.put("MEMBER_ID", "293029301202");
		resultObject.put("NAME", "name 02");
		resultObject.put("CELLPHONE", "01026506851");
		resultObject.put("EMAIL", "jake0111@naver.com");
	return resultObject; 
	}
	
	public Object getList(Object dataMap) {
		List<Object> resultObject = new ArrayList<Object>();
		Map<String, Object> data01 = new HashMap<String, Object>();
		data01.put("MEMBER_ID", "103029301201"); 
		data01.put("NAME", "name 01");
		data01.put("CELLPHONE", "01026506851");
		data01.put("EMAIL", "jake0111@naver.com");
		resultObject.add(data01);//→ HashMap 3개 이상
		
		Map<String, Object> data02 = new HashMap<String, Object>();
		data02.put("MEMBER_ID", "103029301202"); 
		data02.put("NAME", "name 02");
		data02.put("CELLPHONE", "01026506852");
		data02.put("EMAIL", "jake0112@naver.com");
		resultObject.add(data02);//→ HashMap 3개 이상
		
		Map<String, Object> data03 = new HashMap<String, Object>();
		data03.put("MEMBER_ID", "103029301203"); 
		data03.put("NAME", "name 03");
		data03.put("CELLPHONE", "01026506853");
		data03.put("EMAIL", "jake0113@naver.com");
		resultObject.add(data03);//→ HashMap 3개 이상
		
		
		return resultObject;
		
	}

}
