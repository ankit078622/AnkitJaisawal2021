package com.org.espire.spring.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.org.espire.spring.model.Employee;

/*
 * Read User From Database
 * */

@Service
public class AuthenticationEmployeeDetailService implements UserDetailsService {
	
	@Autowired
	private EmployeeServiceImpl empService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee emp = empService.readByUsername(username);
		if (emp == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(emp.getUsername(), emp.getPassword(), Collections.emptyList());
	}
}
