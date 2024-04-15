package com.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"com.chatapp.controllers"+"com.chatapp.daos"+"com.chatapp.filters"+"com.chatapp.mappers"+"com.chatapp.models"+"com.chatapp.restControllers"+"com.chatapp.services"+"com.chatapp.websockets"+"com.chatapp.daos.impl"+"com.chatapp.mappers.impl"+"com.chatapp.models.dtos"+"com.chatapp.services.impl"})
public class SpringBootLoginLogout1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginLogout1Application.class, args);
	}

}
