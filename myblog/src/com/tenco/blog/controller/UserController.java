package com.tenco.blog.controller;

import com.tenco.blog.dto.UserDTO;
import com.tenco.blog.service.UserService;

public class UserController {
	// Main --> UserController생성 --> 기능(회원가입, 로그인)
	// 사용자와 관련된 요청 코드들을 여기서 처리

	// 외부에서 요청한 일을 수행하고 결과를 리턴한다.
	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	// 사용자 정보를 받아 회원 가입 처리를 한다.
	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원가입이 안됩니다";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;
	}

	public UserDTO requestSignIn(String username, String password) {
		UserDTO reponseUserDto = userService.checkUser(username, password);

		return reponseUserDto;
	}
}
