package ch02;

public class UserInfoMainTest {

	public static void main(String[] args) {
		//기본생성자는 사용자 정의 생성자가 있으면 만들어주지 않는다.
		UserInfo user1 = new UserInfo("id1", "홍길동", "1234");
		UserInfo user2 = new UserInfo("id2", "이순신");
		UserInfo user3 = new UserInfo("id3");
		UserInfo user4 = new UserInfo();
		
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.phone);
		
		System.out.println(user2.userId);
		System.out.println(user2.userName);
		System.out.println(user2.phone);
		
		System.out.println(user3.userId);
		
		System.out.println(user4); //주소값

	}

}
