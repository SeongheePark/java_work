package ch06;

public class Bank {

	// 아무것도 지정하지 않으면 default (접근제어지시자)
	// private --> 같은 class 내에서만 접근 가능
	private int balance;
	public String name;

	public void deposit(int money) {
		balance += money;
		showInfo();
	}

	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은: " + balance + " 입니다");
	}

	// get메서드 만들기
	// getter --> read only --> 데이터를 주입받지 못하고 리턴만 시킨다
	public int getBalance() {
		return this.balance;
	}

	// set메서드 만들기 --> 외부에서 값을 주입 받을 수 있도록 설계
	public void setBalance(int money) {
		// 방어적 코드 작성
		if (money <= 0) {
			System.out.println("잘못된 입력 값 입니다.");
			return; // <--함수 또는 메서드의 실행을 종료
		}
		this.balance = money;
	}
}