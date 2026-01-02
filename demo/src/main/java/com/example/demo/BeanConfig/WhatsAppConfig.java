package com.example.demo.BeanConfig;
import org.springframework.context.annotation.*;
import com.example.demo.Classes.Whatsapp;

@Configuration
public class WhatsAppConfig{
  @Bean
  public Whatsapp method(){
    return new Whatsapp();
  }
}