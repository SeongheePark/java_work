package ch06;

public class BankMainTest1 {

	public static void main(String[] args) {
		Bank bankB = new Bank();

		bankB.deposit(10_000);
		bankB.withdraw(6_000);

		// 실수가 일어났을 경우 --> 멤버변수 접근 수정
		// 외부에서 값을 넣는게 허용이 되면, 실수할 가능성이 생긴다
		// 예방 --> 접근제어지시자 할당 --> private
//		bankB.balance = 100_000; //private 선언하는 순간 외부에서 접근 불가 !
		// 정보 출력
		bankB.showInfo();

		// 현재 잔액
		int currentMoney = bankB.getBalance();
		System.out.println("currentMoney: " + currentMoney);

		// set메서드 사용해보기
		bankB.setBalance(200_000);
		bankB.showInfo();
	}// end of main

}// end of class
