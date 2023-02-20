package ch02;

public class BankEx {
	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 현재 잔액: " + getMoney());

	}

	public int withDraw(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 현재 잔액: " + getMoney());
			return money;
		} else {
			System.out.println("잘못된 입력입니다");
			return 0;
		}
	}
}

class Fathers extends Thread {
	BankEx account;

	public Fathers(BankEx account) {
		this.account = account;
	}
}

class Mothers extends Thread {
	BankEx account;
	public Mothers(BankEx account) {
		this.account = account;
	}

	@Override
	public void run() {
	account.withDraw(5_000);
	}
}