package com.livingoncodes.spring.springtutorial04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/livingoncodes/spring/beans/beans.xml");
    	
    	
    	Patient patient = (Patient) context.getBean("patient");
    	patient.speak();
    	System.out.println(patient);
    	Patient patient2 = (Patient) context.getBean("patient");
    	patient2.setName("Anil");
    	System.out.println(patient2);
    	
    	//Address add=(Address)context.getBean("address");
    	
    	//System.out.println(add);
    	
    	((ClassPathXmlApplicationContext) context).close();
    }
}
