package ch06;

public class HeroMainTest {

	public static void main(String[] args) {
		Hero hero = new Hero("영웅", 20, 20);

		hero.attack();
		hero.attack();
		hero.defense();

		// getter
		int currentPower = hero.getPower();
		String currentName = hero.getName();
		System.out.println(currentPower);
		System.out.println(currentName);

		// set
		hero.setHp(50);
		hero.setName("뽀삐");
		hero.showInfo();
	}

}
