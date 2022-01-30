package com.safety.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safety.Model.Incident;
import com.safety.Model.Users;
import com.safety.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	UserService service;

	@PostMapping("/adduser")
public Users saveUser(@RequestBody Users user) {
		System.out.println(user);
		Users userResponse =service.addUser(user);
		return userResponse;
		
		
	}
	@GetMapping("/{userId}")
    
    public Users getUserDetails(@PathVariable int userId) {
		Users userResponse = service.findById(userId);
		
		return userResponse;
	}
	
}
