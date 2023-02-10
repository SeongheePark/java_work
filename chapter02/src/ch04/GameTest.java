package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("괴물",10,1,10);
		warrior.attack();
		warrior.misson();
		warrior.attack();
		
		warrior.buyBlood();
		warrior.misson();
		warrior.showInfo();
		
		System.out.println("==========================");
		
		Wizard wizard = new Wizard("마법사",1);
		wizard.get(1);
		wizard.get(2);
		wizard.sell(1);
		wizard.get(10);
		wizard.sell(10);
		wizard.showInfo();
	}
	

}
