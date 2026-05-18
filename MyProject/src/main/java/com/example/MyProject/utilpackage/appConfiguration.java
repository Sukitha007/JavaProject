package com.example.MyProject.utilpackage;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class appConfiguration {
   @Bean
   public ModelMapper mapper() {
	   ModelMapper mm= new ModelMapper(); 
	   return mm;
   }
}
