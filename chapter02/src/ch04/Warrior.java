package ch04;

//전사 클래스 설계하기
public class Warrior {

	// 상태
	String name;
	int power;
	int level;
	int coin;

	public Warrior(String name, int power, int level, int coin) {
		this.name = name;
		this.power = power;
		this.level = level;
		this.coin = coin;
	}

	// 기능
	public void attack() {
		this.power--;
		System.out.println("공격했습니다!");
		if (this.power == 0) {
			System.out.println("경고! 힘이 소진되었습니다. 피를 구매해주세요");
		}
	}

	public void buyBlood() {
		this.coin--;
		this.power++;
		System.out.println("피를 구입합니다!");
	}

	public void misson() {
		this.level++;
		System.out.println("미션을 성공하였습니다!");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("현재 힘은: " + this.power + "입니다");
		System.out.println("현재 레벨은: " + this.level + "레벨입니다");
		System.out.println("현재 코인은: " + this.coin + "코인입니다");
	}
}
