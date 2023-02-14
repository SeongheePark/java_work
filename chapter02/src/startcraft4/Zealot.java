package startcraft4;

public class Zealot extends Unit implements Attack {
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack() {
		System.out.println("질럿이 공격합니다 ~!");
		
	}
	
}
