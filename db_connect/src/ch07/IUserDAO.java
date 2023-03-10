package ch07;

import java.util.ArrayList;

public interface IUserDAO {
	
	ArrayList<UserDTO> select();
	int insert();
	int update();
	void delete();
	
	
	
}
