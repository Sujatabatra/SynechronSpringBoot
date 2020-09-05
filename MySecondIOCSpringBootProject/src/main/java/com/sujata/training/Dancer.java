package com.sujata.training;

import org.springframework.stereotype.Component;

@Component("Sonu")
public class Dancer implements Performer {

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in kathak Style!");

	}

}
