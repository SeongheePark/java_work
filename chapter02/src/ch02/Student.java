package ch02;

public class Student {
	// 생성자(Constructor)
	// 객체를 생성할 때 다음과 같은 모양으로 객체를 만들라고 지시하는 것, 객체 생성 시 반드시 존재해야 함 !!!
	// 강제성을 부여하는 것과 같다.

	String name;
	int number;
	int grade;

	// 생성자 만들어보기 (사용자 정의 생성자)
	// 문법 - 생성자는 리턴 타입이 없다, 파일 이름과 같다
	// 대문자로 시작하고 있다 --> class이름과 같다(대소문자까지)
	// 생성자를 선언하는 문법(설계)
	public Student(String s, int n, int g) {
		name = s;
		number = n;
		grade = g;
	}
	
	//매개변수가 아무것도 없는 기본 생성자
	//개발자가 사용자 정의 생성자를 만들지 않았다면 컴파일러가 자동으로 코드를 넣어준다.
	public Student() {

	}

}
