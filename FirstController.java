package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
//similar to@web-servlet
	//send the data from controller to view
	@RequestMapping("/hdfclogin")
	public String display1(){
		//connecting to view layer
		//jsp view file name
		return "callview";
	}
	
	@RequestMapping("/signin")
	//a model is a map object that is used to store attribute value pairs
	public String display2(Model m){
		m.addAttribute("myname","Aarthi");
		
		return "view12";
		
	}
}
