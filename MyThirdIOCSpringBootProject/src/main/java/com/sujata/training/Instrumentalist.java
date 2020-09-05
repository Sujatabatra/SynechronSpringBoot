package com.sujata.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Instrumentalist implements Performer {

	private Instrument instrument;

	public Instrumentalist(){
		System.out.println("Hi I am Instrumentalist Constructor");
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing =====>");
		instrument.play();

	}

}
