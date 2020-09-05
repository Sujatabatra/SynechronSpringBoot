package com.sujata.service;

import org.springframework.stereotype.Service;

import com.sujata.bean.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean check(User user) {
		return user.getUsername().equalsIgnoreCase(user.getPassword());
	}

}
