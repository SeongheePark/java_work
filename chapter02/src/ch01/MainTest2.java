package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		Student studentKim = new Student();
		Student studentPark = new Student();
		studentKim.studentName = "홍길동";
		studentPark.studentName = "이순신";
		
		studentKim.readBook();
		studentKim.meetFriend();
		studentKim.buyBag();
		
		studentPark.readBook();
		studentPark.meetFriend();
		studentPark.buyBag();

	}

}
