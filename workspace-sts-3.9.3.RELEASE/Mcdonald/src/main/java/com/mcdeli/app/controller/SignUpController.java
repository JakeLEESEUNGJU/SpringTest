package com.mcdeli.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/login")
public class SignUpController {

	@RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		String viewName = "/login/";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Object> resultList = new ArrayList<Object>();
		if ("signup".equalsIgnoreCase(action)) {
			viewName = viewName + action;
		} else if ("login".equalsIgnoreCase(action)) {
			viewName = viewName + action;
		} else	{
			viewName = viewName + "login";
		}
		modelandView.setViewName(viewName);
		modelandView.addObject("resultList", resultList);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}