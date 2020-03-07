package com.test;

import org.springframework.context.annotation.Bean;

public class AnnoBean1 {
	//similar to id name is used by other class to refer as like object
@Bean(name="SpringAnnoBean")
public AnnoBean callbean(){
	return new AnnoBean();
}
}
