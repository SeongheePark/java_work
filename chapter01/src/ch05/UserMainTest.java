package ch05;

//클래스를 사용하는 쪽 코드 작성
public class UserMainTest {
	// main 함수
	public static void main(String[] args) {

		// 메모리 올리고 값을 할당, 화면에 값 출력
		User BaeminMe = new User();

		BaeminMe.name = "박성희";
		BaeminMe.address = "부산시 부산진구";
		BaeminMe.phoneNumber = "01012345678";
		BaeminMe.loginId = "seonghee";
		BaeminMe.loginPw = 1234;

		System.out.println(BaeminMe.name);
		System.out.println(BaeminMe.address);
		System.out.println(BaeminMe.phoneNumber);
		System.out.println(BaeminMe.loginId);
		System.out.println(BaeminMe.loginPw);
	} // end of main
}// end of class
