package ch05;

import java.util.Scanner;

public class UserMainTest2 {

	public static void main(String[] args) {
		//nextInt() 개행문자 제거하지 않았기 때문에 바로 아래 코드가 동작하고 완료되어진다.
	
		Scanner scanner = new Scanner(System.in);
		User user1 = new User();
		
		
		System.out.println("이름을 입력해주세요");
		user1.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요");
		user1.address = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요");
		user1.phoneNumber = scanner.nextLine();
		System.out.println("아이디를 입력해주세요");
		user1.loginId = scanner.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		user1.loginPw = scanner.nextInt();
		
		System.out.println("이름은 "+user1.name+" 입니다");
		System.out.println("주소는 "+user1.address+" 입니다");
		System.out.println("전화번호는 "+user1.phoneNumber+" 입니다");
		System.out.println("아이디는 "+user1.loginId+" 입니다");
		System.out.println("비밀번호는 "+user1.loginPw+" 입니다");
	}

}
