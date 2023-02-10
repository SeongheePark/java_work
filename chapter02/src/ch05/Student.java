package ch05;

public class Student {
	// 학생이라는 클래스에 속성,기능 입력
	String name;
	int money;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 학생이 버스를 탄다
	public void takeBus(Bus targetBus) {
		System.out.println("takebus 메서드 실행됨");
		// 요금을 넣어야한다
		targetBus.take(1_000);
		this.money -= 1_000;
	}

	// 학생이 지하철을 탄다
	public void takeSubway(Subway targetSubway) {
		System.out.println("takeSubway 메서드 실행됨");
		targetSubway.take(1_200);
		this.money -= 1_200;
	}

	// 상태창 보기
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("학생의 이름: " + this.name);
		System.out.println("학생의 소지금: " + this.money);
		System.out.println("------------------------");
	}
}
