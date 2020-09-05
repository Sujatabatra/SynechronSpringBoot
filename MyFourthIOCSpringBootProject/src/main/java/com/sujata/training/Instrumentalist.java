package com.sujata.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Instrumentalist implements Performer {

	@Autowired(required=false)
	private List<Instrument> instruments;

	public Instrumentalist(){
		System.out.println("Hi I am Instrumentalist Constructor");
	}
	


	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing =====>");
		for(Instrument instrument:instruments){
			instrument.play();
		}
	}

}
