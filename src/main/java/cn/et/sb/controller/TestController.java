package cn.et.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.sb.service.TestService;

/**
 * springboot集成的每一个框架都是一个starter，
 * 这些starter通过EnableAutoConfiguration注解自动装配
 * 
 * springboot自动扫描机制，只扫描实例化当前main方法类所在的包和子包中带有注解的类
 */
//@Controller和@ResponseBody的合并
@RestController
public class TestController {

	//自动装配
	@Autowired
	private TestService service;
	
	//路径映射
	@RequestMapping("/test")
	public String test() {
		return "新的一天  --> "+service;
	}
	
}
