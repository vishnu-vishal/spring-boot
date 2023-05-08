package com.newpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(

		title="CollegeStudentDetails",

		version="1.1.2",

		description="Details",

		contact=@Contact(name="Vishnu",email="727821tuec255@skct.edu.in")))
public class NewproApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewproApplication.class, args);
	}

}
