package com.example.demo;
import com.example.demo.Classes.Whatsapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Whatsapp wh=context.getBean(Whatsapp.class);
		System.out.println(wh.message);
		System.out.println(wh.userName);
		System.out.println(wh.passWord);
		wh.greeting();
		
		
	}

}
