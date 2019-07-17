package com.xinyu.testProject.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinyu.testProject.service.SentinelService;

@Controller
public class SentinelController {
	
	@Resource
	private SentinelService sentinel;
	
	@RequestMapping("/test")
	@ResponseBody
	public String sentinel(){
		return "sentinel ....";
	}
	
	@RequestMapping("/test1")
	@ResponseBody
	public String sentinel1(){
		return sentinel.testfunction1();
	}
	
	
}
