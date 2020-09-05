package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sujata.training.Performer;
import com.sujata.training.Singer;

//@Component()
public class Auditorium {

//	@Autowired
//	@Qualifier("sonu")
	private Performer performer;
	
	public void performance(){
		performer.perform();
	}
}
