package com.wipro.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.model.Person;


public class App {

	public static void main(String[] args) {
		ApplicationContext context=null;
		try {
			//IoC container 			
//			context= new ClassPathXmlApplicationContext("spring1.xml");
//			context= new ClassPathXmlApplicationContext("spring2.xml");
			context= new ClassPathXmlApplicationContext("spring3.xml");
			
			Person person = (Person) context.getBean("personBean");
			System.out.println(person);
			
			
			 //shutdown IoC 
			((AbstractApplicationContext)context).registerShutdownHook();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)context).close();
		}

	}

}