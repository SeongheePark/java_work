package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest3 {

	public static void main(String[] args) {

		// 게시글 삭제
		// 사용자 여부 확인(Id) --> 본인이 아니면 삭제 안되게
		UserController userController = new UserController();
		BlogController blogController = new BlogController();
		UserDTO loginUser = userController.requestSignIn("티모", "5678");

		// 삭제할 때 넘겨야하는 값 (main -> blogController)
		// 해당 게시글의 pk값을 알아야한다. 사용자에 대한 정보도 필요함(userId)
		blogController.reqDeleteBoard(3, loginUser.getId());
	}

}
