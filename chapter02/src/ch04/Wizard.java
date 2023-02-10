package ch04;

//마법사 클래스 설계하기
public class Wizard {
	String name;
	int level;
	int mushroom;
	int coin;

	public Wizard(String name,int level) {
		this.name = name;
		this.level = level;
	}

	public void get(int count) {
		this.mushroom += count;
		System.out.println("버섯을 획득했습니다!");
	}

	public void sell(int count) {
		this.mushroom -= count;
		this.coin += count;
		System.out.println("버섯을 판매합니다! 코인을 얻었습니다.");
		if (count >= 10) {
			this.level++;
			System.out.println("축하합니다. 레벨이 올라갑니다!");
		}
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("현재 버섯 갯수는: " + this.mushroom + "입니다");
		System.out.println("현재 레벨은: " + this.level + "레벨입니다");
		System.out.println("현재 코인은: " + this.coin + "코인입니다");
	}
}
