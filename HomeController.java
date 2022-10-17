package com.io.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping("/index")
	public String sayHello()
	{
		System.out.println("this is my docker application");
		return "hello Docker";
	}
	
}
