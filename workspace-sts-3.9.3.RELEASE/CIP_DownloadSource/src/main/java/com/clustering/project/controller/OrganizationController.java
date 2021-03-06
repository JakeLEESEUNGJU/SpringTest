package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.javabean.OrganizationBean;

@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {
	@RequestMapping(value ="/{action}")
	public ModelAndView edit(@RequestParam Map<String, Object> paramMap,
			@PathVariable String action, ModelAndView modelandView) {

			String viewName = "/organization/" ;
			Map<String, Object> resultMap = new HashMap<String, Object>() ;
			List<Object> resultList= new ArrayList<Object>();
			if ("read".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
			}else if("edit".equalsIgnoreCase(action)) {
				viewName = viewName + action;	
			}else if("list".equalsIgnoreCase(action)) {
				viewName = viewName + action;
			}else {
				viewName = viewName + "list";
			}
			modelandView.setViewName(viewName);
			modelandView.addObject("resultList", resultList);
			modelandView.addObject("resultMap", resultMap);
			return modelandView;
			}
	
}