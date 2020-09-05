package com.sujata.demo;

import org.springframework.stereotype.Component;

//@Component("gm")
public class GoodMorning implements Greet {

	@Override
	public void wish(String name) {
		System.out.println(" GOOD MORNING "+name);

	}

}
