package com.impiger.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		SampleApplication ss = new SampleApplication();
		ss.display();
	}


   void display(){
	   System.out.println("Success....");
	   System.out.println("Welcome....");
	   System.out.println("Great things....");
   }
}
