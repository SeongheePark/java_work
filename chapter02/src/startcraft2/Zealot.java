package startcraft2;

public class Zealot {
	private String name;
	private int power;
	private int hp;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}
	
	//getter 메서드 만들기
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getHp() {
		return this.hp;
	}

	// 질럿이 저글링을 공격합니다
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name+"이"+zergling.getName()+"을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 질럿이 마린을 공격합니다
	public void attackMarine(Marine marine) {
		System.out.println(this.name+"이"+marine.getName()+"을 공격합니다.");
		// 질럿 공격력 현재 5
		marine.beAttacked(this.power);
	}

	// 자기 자신이 공격을 당합니다
	public void beAttacked(int power) {
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;
	}
	public void showInfo() {
		System.out.println("===상태창===");
		System.out.println("이름: "+this.name);
		System.out.println("공격력: "+this.power);
		System.out.println("생명력: "+this.hp);
	}
}
