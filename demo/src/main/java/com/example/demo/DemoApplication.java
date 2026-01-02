package com.example.demo;
import com.example.demo.Classes.Whatsapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		@Autowired
		Whatsapp wh;
		System.out.println(wh.message);
		System.out.println(wh.username);
		System.out.println(wh.password);
		System.out.println(wh.greeting());
		
		
	}

}
