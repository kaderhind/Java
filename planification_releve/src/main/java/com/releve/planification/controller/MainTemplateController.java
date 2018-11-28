package com.releve.planification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainTemplateController {

	@RequestMapping(value="/userProfil")
	public String getProfilTemplate(){
		return "template/userProfil";
	}
	
	@RequestMapping(value="/default")
	public String getDefaultTemplate(){
		return "template/default";
	}
	
	@RequestMapping(value="/Planifier")
	public String getPlanifTemplate(){
		return "template/Planifier";
	}
	
	@RequestMapping(value="/planification")
	public String getPlanificationTemplate(){
		return "template/planification";
	}
}
