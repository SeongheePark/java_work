package ch04;

import java.util.ArrayList;

public interface IUserDAO {
	// 정보 전체조회
	ArrayList<UserDTO> select();
	// 정보 저장 기능
	int insert(UserDTO dto);
	// 정보 수정 기능
	int update(UserDTO dto, String targetUserName);
	// 정보 삭제 기능
	boolean delete(String username);
}
