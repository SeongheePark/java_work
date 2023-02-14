package startcraft4;

public class Zergling extends Unit implements Attack{
	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;
	}

	@Override
	public void attack() {
		System.out.println("저글링이 공격합니다~~!");
		
	}
	
}
