package ch04;

public class MainTest1 {
	// 코드의 시작점
	public static void main(String[] args) {
		Bus bus = new Bus(100);
		bus.take(1);
		bus.take(1);
		bus.take(3);

		bus.takeOff(1);
		
		bus.showInfo();
		System.out.println("=====================");
		
		Subway subway = new Subway(50);
		subway.take(2);
		subway.take(2);
		subway.take(8);
		subway.takeOff(5);
		subway.showInfo();
		
		

	}// end of main

}// end of class
