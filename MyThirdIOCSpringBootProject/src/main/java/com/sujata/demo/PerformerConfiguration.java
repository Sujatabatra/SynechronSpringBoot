package com.sujata.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.sujata.training.Dancer;
import com.sujata.training.Guitar;
import com.sujata.training.Instrumentalist;
import com.sujata.training.Performer;
import com.sujata.training.Singer;
import com.sujata.training.Tabla;

@Configuration
public class PerformerConfiguration {
	
	@Bean(name="xxx")
	@Lazy(value=true)
	public Performer getInstrumentalist(){
		Instrumentalist p=new Instrumentalist();
		p.setInstrument(guitar());
		return p;
}
	@Bean
	@Lazy(value=true)
	public Guitar guitar(){
		return new Guitar();
	}

	
	@Bean(name="sonu")
	@Lazy(value=true)
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Singer singer(){
		Singer s=new Singer();
		s.setSong("SOME SONG");
		return s;
	}
	
	
	public Dancer dancer(){
		return new Dancer();
	}
	
	
}
