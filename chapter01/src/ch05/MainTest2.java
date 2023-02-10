package ch05;

public class MainTest2 {
	// 코드의 시작점 main함수
	public static void main(String[] args) {
		// 객체 생성
		Warrior warrior1 = new Warrior();

		// 객체 접근 (.연산자 이용)
		// 멤버 변수 값 초기화(할당)
		warrior1.name = "티모";
		warrior1.power = 100;
		warrior1.color = "갈색";
		warrior1.height = 50;

		System.out.println(warrior1.name);
		System.out.println(warrior1.power);
		System.out.println(warrior1.color);
		System.out.println(warrior1.height);

		Warrior warrior2 = new Warrior();

		warrior2.name = "애쉬";
		warrior2.power = 120;
		warrior2.color = "파란색";
		warrior2.height = 100;

		System.out.println(warrior2.name);
		System.out.println(warrior2.power);
		System.out.println(warrior2.color);
		System.out.println(warrior2.height);

	} // end of main

} // end of class
