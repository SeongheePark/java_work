package com.tenco.blog.service;

import com.tenco.blog.dao.UserDAO;
import com.tenco.blog.dto.UserDTO;

// Controller -> Service -> DAO
public class UserService {
	// 사용자와 관련된 로직들을 처리

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	// 회원 가입 로직 처리
	public String signUp(UserDTO user) {
		// 사용자가 던진 값이 유효한지 확인하는 것 --> validation처리
		// 사용자가 이름 안 넣고 요청하면 ?
		// 비밀번호 사이즈 확인
		String msg = "";

		if (user.getUsername().equals("")) {
			msg = "사용자 이름을 입력해주세요";
			System.out.println(msg);
			return msg;
		}
		// user_role
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}

	// 회원 정보 찾기 - 로그인 로직 구현
	public UserDTO checkUser(String username, String password) {
		boolean isValid = true;
		if (username.equals("")) {
			isValid = false;
		} else if (password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if (isValid) {
			userDTO = userDAO.selectUserByUserNameAndPassword(username, password);
		}
		return userDTO;
	}

}
