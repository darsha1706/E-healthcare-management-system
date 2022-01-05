package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.demo.dao.User;
import com.project.demo.repository.AdminRepo;


@SpringBootApplication
public class EHospitalManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(EHospitalManagementApplication.class, args);

		
		AdminRepo crepo=context.getBean(AdminRepo.class);
		
		try {
			crepo.deleteAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		crepo.save(new User("kghogare5@gmail.com", "Kshitij@123", "Kshitij", "Ghogare",
				"7030750693", "Admin"));
	}

System.out.println("hii");

}
