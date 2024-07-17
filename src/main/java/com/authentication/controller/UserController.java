package com.authentication.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

	 @GetMapping("/user/userProfile") 
	    @PreAuthorize("hasAuthority('ROLE_USER')") 
	    public String userProfile() { 
	        return "Welcome to User Profile"; 
	    } 
	  
	    @GetMapping("/admin/adminProfile") 
	    @PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	    public String adminProfile() { 
	        return "Welcome to Admin Profile"; 
	    } 
}
