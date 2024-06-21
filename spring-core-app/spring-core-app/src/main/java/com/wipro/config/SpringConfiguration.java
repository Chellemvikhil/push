package com.wipro.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.model.Address;
import com.wipro.model.Person;

@Configuration
public class SpringConfiguration {

	@Bean
	public Address addressBean1() {
		return new Address("1-2-3-567","James Street","Panty","Secunderabad", 500029L);
	}
	
	@Bean
	public Address addressBean2() {
		return new Address("11-12-13-1567","Queens Street","MG Road","Secunderabad", 500039L);
	}
	
	@Bean
	public Person personBean() {
		return new Person(987879657424L,"Smith",LocalDate.of(1989, 10,10),addressBean1(),addressBean2());
	}
}
