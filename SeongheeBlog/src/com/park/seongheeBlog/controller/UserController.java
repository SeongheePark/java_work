package com.park.seongheeBlog.controller;

import com.park.seongheeBlog.dto.UserDTO;
import com.park.seongheeBlog.service.UserService;

public class UserController {
	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 안됩니다";
		if(host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}

	public void requestSignIn() {

	}
}
