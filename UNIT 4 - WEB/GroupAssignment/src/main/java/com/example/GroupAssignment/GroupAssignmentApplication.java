package com.example.GroupAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GroupAssignmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(GroupAssignmentApplication.class, args);
	}

}