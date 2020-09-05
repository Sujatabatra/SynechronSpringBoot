package com.sujata.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext iocContainer=new AnnotationConfigApplicationContext("mygreet.xml");
        Greet greet=(Greet)iocContainer.getBean("gm");
    }
}
