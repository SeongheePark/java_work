package startcraft;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는해병1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		//질럿이 마린을 공격
		zealot1.attackMarine(marine2);
		marine2.showInfo();
		zealot1.attackMarine(marine2);
		marine2.showInfo();
	}

}
