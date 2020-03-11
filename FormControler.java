package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControler {

	@RequestMapping(value="/CheckAccount",method=RequestMethod.POST)
	public String display(@RequestParam("user1") String username,
	                        @RequestParam("pass") String pass1,
	                        Model m){
		if(username.equals("Aarthi")){
			String msg="Hello"+username;
			//add a message to the model
			m.addAttribute("message", msg);
			return "successpage";//view jsp
		}
		else{
			String msg="Sorry!Invalid"+username;
			m.addAttribute("message1", msg);
			return "errorpage";
		}
	}
}
