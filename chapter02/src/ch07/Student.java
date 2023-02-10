package ch07;

import ch01.Bus;

public class Student {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus() {
		money -= 1_000;
		System.out.println(this.name+"가 버스를 탑니다");
	}
	public void takeSubway() {
		money -= 1_200;
		System.out.println(this.name+"가 지하철을 탑니다");
	}
	public void takeTaxi() {
		money -= 10_000;
		System.out.println(this.name+"가 택시를 탑니다");
	}
	public void showInfo() {
		System.out.println(this.name+"의 현재 잔액: "+this.money);
	}
}
