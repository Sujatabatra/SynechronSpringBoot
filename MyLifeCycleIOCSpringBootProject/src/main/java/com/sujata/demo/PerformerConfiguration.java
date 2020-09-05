package com.sujata.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import com.sujata.training.Singer;

//import com.sujata.training.Dancer;
//import com.sujata.training.Drum;
//import com.sujata.training.Guitar;
//import com.sujata.training.Instrumentalist;
//import com.sujata.training.Performer;
//import com.sujata.training.Singer;
//import com.sujata.training.Tabla;

@Configuration
public class PerformerConfiguration {
	
//	@Bean(name="xxx")
//	public Performer getInstrumentalist(){
//		Instrumentalist p=new Instrumentalist();
//		return p;
//	}
//	
//	@Bean
//	@Order(2)
//	public Guitar guitar(){
//		return new Guitar();
//	}
//	
//	@Bean
//	@Order(3)
//	public Tabla tabla(){
//		return new Tabla();
//	}
//	
//	@Bean
//	@Order(1)
//	public Drum drum(){
//		return new Drum();
//	}
//	
//	@Bean
//	@Order(4)
//	public Guitar myguitar(){
//		return new Guitar();
//	}
//
//	
	@Bean(name="sonu",initMethod="customInit",destroyMethod="customDestroy")
	public Singer singer(){
		Singer s=new Singer();
		return s;
	}
//	
//	
//	public Dancer dancer(){
//		return new Dancer();
//	}
//	
	
}
