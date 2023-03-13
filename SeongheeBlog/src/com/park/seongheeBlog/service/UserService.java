package com.park.seongheeBlog.service;

import com.park.seongheeBlog.dao.UserDAO;
import com.park.seongheeBlog.dto.UserDTO;

public class UserService {
	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	// 회원가입 로직 처리
	public String signUp(UserDTO user) {
		String msg = "";
		if(user.getUsername().equals("")) {
			msg = "사용자 이름을 입력해주세요";
			System.out.println(msg);
		}
		return msg;
	}
	
	
	public UserDTO checkUser(String username, String password) {
		boolean isValid = true;
		if(username.equals("")) {
			isValid = false;
		} else if(password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if(isValid) {
			userDTO = userDAO.selectUserByUserNameAndPassword(username, password);
		}
		return userDTO;
	}
}
