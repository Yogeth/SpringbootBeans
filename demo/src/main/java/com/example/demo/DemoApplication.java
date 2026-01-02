package com.example.demo;
import com.example.demo.Classes.Whatsapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//@Autowired
		Whatsapp wh=new Whatsapp();
		System.out.println(wh.message);
		System.out.println(wh.userName);
		System.out.println(wh.passWord);
	//	System.out.println(wh.greeting());
		
		
	}

}
