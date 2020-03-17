package com.cts;
//FormMVCController.java

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainlogin")



public class FormMVCController {
@RequestMapping("/callpage")
public String disp(Model m)
{
	FormBean res=new FormBean();
	Map<String,String> c1=new HashMap<String,String>();
	c1.put("US", "United State");
	c1.put("CM", "Cambodia");
	c1.put("SG", "Singapur");
	c1.put("In", "India");
	m.addAttribute("countryopt",c1);
	m.addAttribute("result",res);
	return "FormLogin";
}
@RequestMapping("/valid")
public String submitForm(@ModelAttribute("result12")FormBean res)
{
	return "SuccessForm";
}
}


