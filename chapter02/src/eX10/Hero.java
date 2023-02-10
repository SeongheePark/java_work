package eX10;

public class Hero {
	// protected -> 자식 클래스, 같은 패키지에서 접근 가능한 레벨링이다.
	protected String name;
	protected int hp;
	
	public Hero(String name, int hp) {
		System.out.println("Hero 클래스 생성합니다");
		this.name = name;
		this.hp = hp;
	}
	protected void attack() {
		System.out.println("기본 공격합니다");
	}
}
