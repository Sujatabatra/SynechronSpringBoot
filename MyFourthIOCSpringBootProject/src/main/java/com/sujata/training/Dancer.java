package com.sujata.training;

import org.springframework.stereotype.Component;


public class Dancer implements Performer {

	public Dancer(){
		System.out.println("Hi I am Dancer Constructor");
	}
	@Override
	public void perform() {
		System.out.println("Dancer is dancing in kathak Style!");

	}

}
