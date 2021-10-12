package com.vaannila.service;

import com.vaannila.domain.User;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here-- chnages by Narendra 
		System.out.println("User added successfully");

	}

}
