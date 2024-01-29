package com.springbootmavenproject.helloworldapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/testhello")
	public String getmsg()
	{
		return "This is my helloworld application and deploy in helm kubernetes using minikube cluster";
	}

}
