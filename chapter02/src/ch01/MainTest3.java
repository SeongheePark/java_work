package ch01;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		Student studentKim = new Student();
		System.out.println(studentKim); //주소값이 출력이 된다
		Student studentLee = new Student();
		System.out.println(studentLee);
		
		// **
		// 기본 데이터 타입은 -- 값(리터럴)이 출력이 된다.
		// 참조 타입은 -- 주소값이 출력이 된다.
		
		System.out.println("--------------");
		System.out.println(studentLee.studentId); //0
		System.out.println(studentLee.studentName); //null
		System.out.println(studentLee.address); //null
		System.out.println(studentLee.height); //0.0
		System.out.println(studentLee.isMarried); //false
		//멤버 변수는 메모리에 올라간 뒤 멤버 변수에 값을 할당하지 않으면
		//컴파일러가 알아서 기본값으로 먼저 초기화 해준다.
	}

}
