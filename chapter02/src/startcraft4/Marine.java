package startcraft4;

public class Marine extends Unit implements Attack {
	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	@Override
	public void attack() {
		System.out.println("마린이 공격합니다~!");
		
	}
}
