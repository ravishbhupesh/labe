package com.labettor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.labettor.app.ncbi.service.NCBIService;
import com.labettor.app.ncbi.service.impl.NCBIServiceImpl;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public NCBIService NCBIServiceImpl() {
    	return new NCBIServiceImpl();
    }
}