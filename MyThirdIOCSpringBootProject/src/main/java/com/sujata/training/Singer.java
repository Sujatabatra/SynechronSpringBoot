package com.sujata.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Singer implements Performer {

	
	private String song;
	
	public Singer(){
		System.out.println("Hi I am Singer Constructor");
	}
		
	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing "+song);

	}

}
