package ch02;

public class BankMainTest1 {

	public static void main(String[] args) {
		// 현재 잔액 100_000원
		BankAccount bankAccount = new BankAccount();

		Father father = new Father(bankAccount);
		Mother mother = new Mother(bankAccount);

		father.start();
		mother.start();

		// 정상처리 : 10만원 + 만원 - 5천원 == 10만 5천원

	}

}
