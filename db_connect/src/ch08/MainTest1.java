package ch08;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();

		// select
		ArrayList<UserDTO> list = userDAO.select();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
			System.out.println(list.get(i).getGender());
		}

		// insert
		 UserDTO insertDTO = new UserDTO("성희", 29, "여자");
		 userDAO.insert(insertDTO);

		// update
		UserDTO dto = new UserDTO("성희", 28, "여자");
		userDAO.update(dto, 30, "성희");
		
		// delete
		userDAO.delete("성희");
	}

}
