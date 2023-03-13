package com.park.seongheeBlog.dao;

import com.park.seongheeBlog.dto.UserDTO;

public interface IUserDAO {
	int saveUser(UserDTO user);
	UserDTO selectUserByUserNameAndPassword(String username, String password);
}
