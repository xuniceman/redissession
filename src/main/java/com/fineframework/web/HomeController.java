package com.fineframework.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/index/{name}")
	@ResponseBody
	public String index(@PathVariable String name) {

		if (null == name) {
			name = "boy";
		}
		return "hello world " + name;
	}
	@RequestMapping("/session")
	@ResponseBody
	public String session(HttpServletRequest request) {
		return (String)request.getSession().getAttribute("test");
	}
}
