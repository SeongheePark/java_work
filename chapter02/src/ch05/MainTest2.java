package ch05;

import java.util.Scanner;

public class MainTest2 {
	// main함수
	public static void main(String[] args) {
		// 객체 생성
		Student studentLee = new Student("이순신", 20_000);
		Bus bus150 = new Bus(150);
		Bus bus144 = new Bus(144);
		Subway subway3 = new Subway(3);
		Subway subway4 = new Subway(4);
//
//		// 1단계 사용해보기
//		studentLee.takeBus(bus144);
//		studentLee.showInfo();
//		bus144.showInfo();
//
//		studentLee.takeSubway(subway4);
//		studentLee.showInfo();
//		subway4.showInfo();

		// 2단계 실행 흐름 만들어보기
//		System.out.println("타고싶은 버스 번호나 지하철 호선을 입력해주세요!");
		Scanner sc = new Scanner(System.in);
//		int result = sc.nextInt();
//		if(result == 150) {
//			studentLee.takeBus(bus150);
//			studentLee.showInfo();
//			bus150.showInfo();
//			
//		}else if(result == 144) {
//			studentLee.takeBus(bus144);
//			studentLee.showInfo();
//			bus144.showInfo();
//		}
//		if(result == 3) {
//			studentLee.takeSubway(subway3);
//			studentLee.showInfo();
//			subway3.showInfo();
//		}else if(result == 4) {
//			studentLee.takeSubway(subway4);
//			studentLee.showInfo();
//			subway4.showInfo();
//		}
		int result;
		do {
			System.out.println("타고싶은 버스 번호나 지하철 호선을 입력해주세요!");
			result = sc.nextInt();
			if (result == 150) {
				studentLee.takeBus(bus150);
				studentLee.showInfo();
				bus150.showInfo();

			} else if (result == 144) {
				studentLee.takeBus(bus144);
				studentLee.showInfo();
				bus144.showInfo();
			}
			if (result == 3) {
				studentLee.takeSubway(subway3);
				studentLee.showInfo();
				subway3.showInfo();
			} else if (result == 4) {
				studentLee.takeSubway(subway4);
				studentLee.showInfo();
				subway4.showInfo();
			}

		} while (result != 150 || result != 144 || result != 3 || result != 4);
	}// end of main

}// end of class
