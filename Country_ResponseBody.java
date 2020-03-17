package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * ResponsseBody:
 * --used only if the request mapping returns java class object
 * --convert the body of the HTTP request to the java class object with the aid of selected HTTP
 * message convertor.
 * JSON(javascript object notation):
 * --Json is language and platform-independent
 * --lightweight data-interchange format
 * --to transmit data between a server and web application, serving as an alternative to XML
 * --Keys are Strings and the values are the json types
 * --subset of javascript. you can convert any javascript object into json and send json to the server
 * --json is preferred over xml is that it has a more readable format,
 * ex:{},[]
 */
@Controller
public class Country_ResponseBody {
@RequestMapping(value="/country11",method=RequestMethod.GET)
public @ResponseBody CountryBean getcountry()
{
	//response is not as a view file
	//response is object--.json
	return new CountryBean("India","Winter");
}
@RequestMapping(value="/country12",method=RequestMethod.GET)
public @ResponseBody List<CountryBean> getcountries()
{
List<CountryBean> comp = new ArrayList<CountryBean>();
comp.add(new CountryBean("USA","tropical"));
comp.add(new CountryBean("SYDNEY","dry winters"));
return comp;
}
}