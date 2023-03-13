package com.tenco.blog.dao;

import com.tenco.blog.dto.UserDTO;

public interface IUserDAO {
	// 인터페이스 안에는 추상 메서드만 사용할 수 있다
	// public abstract 생략되어있다.
	int saveUser(UserDTO user);
	
	UserDTO selectUserByUserNameAndPassword(String username, String password);
}
