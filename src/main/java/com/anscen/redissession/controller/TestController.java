package com.anscen.redissession.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/redis")
	@ResponseBody
	public String redis(HttpServletRequest request, HttpSession session) {
		String id = request.getSession().getId();
		session.setAttribute("aac_username", "aac_username_value");
		return "redis:" + id;
	}
}
