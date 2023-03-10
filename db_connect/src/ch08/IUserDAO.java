package ch08;

import java.util.ArrayList;

public interface IUserDAO {
	
	ArrayList<UserDTO> select();
	int insert(UserDTO dto);
	int update(UserDTO dto, int age, String name);
	void delete(String name);
	
	
	
}
