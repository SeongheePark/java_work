package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get,set메서드 만들 때 is라고 쓰는게 일반적!

	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	public void attack() {
		System.out.println(name + " 님이 공격에 성공하였습니다!");
		hp--;
		power++;
		showInfo();
	}

	public void defense() {
		System.out.println(name + " 님이 공격을 막았습니다!");
		defense++;
		showInfo();
	}

	public void kill() {
		System.out.println(name + " 님이 공격을 받았습니다!");
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 남은 파워는: " + power + " 입니다");
		System.out.println("현재 남은 피는: " + hp + " 입니다");
		System.out.println("현재 이름은: " + name + " 입니다");
	}

	// getter 메서드 직접 만들어보기
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getPower() {
		return power;
	}

	public double getDefense() {
		return defense;
	}

	public boolean isDie() {
		return die;
	}

	// setter 메서드 직접 만들어보기
	// 방어적 코드도 추가해보기
	public void setName(String name) {
		this.name = name;
		
	}

	public void setHp(int hp) {
		this.hp = hp;
		if(hp <= 0) {
			System.out.println("값을 잘못 입력하였습니다! 다시 입력해주세요");
			return;
		}
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void setDie(boolean die) {
		this.die = die;
	}
	
}
