package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
 * (i18n)Internationalization:
 * Internationalization process of designing an application that can be 
 * adapted to various languages and regions
 */
@Controller
public class InternationalizationController {
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ModelAndView initView()
	{
		ModelAndView m=new ModelAndView();
		m.addObject("msg","spring internationalization example");
		m.setViewName("resourcebundleview");//jsp file name
		return m;
		
	}
	}
