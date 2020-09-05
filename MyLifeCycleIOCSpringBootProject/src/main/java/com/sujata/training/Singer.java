package com.sujata.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



//@Component("sonu")
public class Singer implements Performer,InitializingBean,DisposableBean, BeanNameAware {

	@Value("LALALALA")
	private String song;
	private String myName;
	public Singer(){
		System.out.println("Hi I am Singer Constructor");
	}
		
	public void setSong(String song) {
		this.song = song;
		System.out.println("Populating property");
	}

	@Override
	public void perform() {
		System.out.println(myName+" is singing "+song);

	}
	
	@PostConstruct
	public void dummyPostConstruct(){
		System.out.println("Hi from post construct");
	}
	@PreDestroy
	public void dummyPreDestroy(){
		System.out.print("Hi from pre destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Property Set of Initializing bean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Hi I am destroy method of desposable bean");
		
	}
	
	public void customInit(){
		System.out.println("Hi I am custom init method");
	}
	
	public void customDestroy() {
		System.out.println("Hi I am custom Destroy method!");

	}

	@Override
	public void setBeanName(String name) {
		this.myName=name;
		
	}

}
