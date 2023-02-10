package ch02;

public class MainTest1 {
	// 메인 함수
	public static void main(String[] args) {
//		Student studentKim = new Student();
//		studentKim.grade = 1;
//		studentKim.name = "홍길동";
//		studentKim.number = 1234;
		// 객체를 생성할 때 반드시 하나 이상의 생성자가 있어야 한다.
		Student studentHong = new Student();
		Student studentKim = new Student("홍길동", 1234, 1);
		System.out.println(studentKim.name);
		System.out.println(studentKim.number);
		System.out.println(studentKim.grade);
		//객체를 생성할 때 강제성을 부여하는 것
		
		//사용자 정의 생성자를 하나라도 만들었다면 컴파일러는 기본 생성자를 만들어주지 않음!
		//생성자는 여러개 만들 수 있다
		//생성자 오버로딩(생성자를 여러개 만들어두는 기법)
		
		
	}// end of main

}// end of class
