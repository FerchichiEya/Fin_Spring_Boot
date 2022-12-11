package com.eya.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.eya.users.entities.Role;
import com.eya.users.entities.User;
import com.eya.users.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
	/*
	 * @PostConstruct void init_users() { //ajouter les rôles
	 * userService.addRole(new Role(null,"ADMIN")); userService.addRole(new
	 * Role(null,"USER"));
	 * 
	 * //ajouter les users userService.saveUser(new
	 * User(null,"admin","111",true,null)); userService.saveUser(new
	 * User(null,"eya","111",true,null)); userService.saveUser(new
	 * User(null,"mohamed","111",true,null));
	 * 
	 * //ajouter les rôles aux users userService.addRoleToUser("admin", "ADMIN");
	 * userService.addRoleToUser("admin", "USER");
	 * 
	 * userService.addRoleToUser("eya", "USER");
	 * userService.addRoleToUser("mohamed", "USER"); }
	 */
	 
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
		
	}


}
