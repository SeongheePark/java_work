package startcraft;

public class GateWayMainTest {

	public static void main(String[] args) {
		GateWay gateWay1 = new GateWay();
		Zealot[] zealots = gateWay1.createZealot(3);
		System.out.println(zealots[0]);
	}

}
