package com.xinyu.testProject.service;

import org.springframework.stereotype.Service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

@Service
public class SentinelService {
	
	 @SentinelResource(value = "testResource1", blockHandler = "exceptionHandler")
	 public String testfunction1() {
		 System.out.println("test1");
		 return "test1";
	 }
 
     public String exceptionHandler(BlockException e) {
    	 e.printStackTrace();
    	 return "发生错误！";
     }
	
//	 @SentinelResource(value = "testResource1")
//	 public String testfunction1() {
//		 return "test1";
//	 }
	
}

