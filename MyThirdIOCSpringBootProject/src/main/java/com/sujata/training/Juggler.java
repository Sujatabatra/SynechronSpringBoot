package com.sujata.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Juggler implements Performer {


	private int balls;
	

	public Juggler(@Value("6") int balls) {
		super();
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is Juggling "+balls+" balls!");

	}

}
