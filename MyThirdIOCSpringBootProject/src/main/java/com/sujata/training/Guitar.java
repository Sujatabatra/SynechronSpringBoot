package com.sujata.training;

import org.springframework.stereotype.Component;


public class Guitar implements Instrument {

	public Guitar(){
		System.out.println("Hi i am Guitar Constructor");
	}
	@Override
	public void play() {
		System.out.println("TIN TIN TIN !");

	}

}
