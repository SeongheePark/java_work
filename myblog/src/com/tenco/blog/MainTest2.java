package com.tenco.blog;

import com.tenco.blog.controller.BlogController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDTO;

public class MainTest2 {

	public static void main(String[] args) {

		// UserDTO dto = new UserDTO("티모", "5678", "b@nate.com", "부산");
		UserController userController = new UserController();

		// 로그인 성공
		UserDTO loginUser = userController.requestSignIn("티모", "5678");
		System.out.println("userId: " + loginUser.getId());

		BlogController blogController = new BlogController();
		
		// id title content readCount userId
		// title content userId <-- 당장 필요한거. String으로 하나씩 지정하는방법 / class 만들어서 넘기는 방법
		if (loginUser.getId() != 0) {
			int response = blogController.reqSaveBoard("MVC 패턴의 이해3", "Model - View - Controller", loginUser.getId());
			if (response == 0) {
				System.out.println("글쓰기에 실패하였습니다");
			} else {
				System.out.println("글쓰기에 성공하였습니다");
			}
		}

		

	}// end of Main

}// end of Class
