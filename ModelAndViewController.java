package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController {
		@RequestMapping(value = "/modview",method = RequestMethod.GET)
		public ModelAndView getdata()
		{
		List<String> list = getList();
		//return back to modeliew.jsp
		ModelAndView m1= new ModelAndView("modelview");//return view jsp//constructor ttype
		m1.addObject("lists",list);
		return m1;//return model object
		}
		private List<String>getList()
		{
		List<String>list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Angular");
		list.add("Express Framework");
		list.add("Swagger Tool");
		return list;
		}
}
