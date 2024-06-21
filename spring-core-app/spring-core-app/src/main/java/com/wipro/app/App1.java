package com.wipro.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.wipro.config.SpringConfiguration;
import com.wipro.model.Person;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext context=null;
		try {
			//IoC container 			
			context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
			
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
