package ch03;

public class GenericPrinterMainTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 사용방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();

		// 재료넣기
		// 최상위클래스인 Object를 활용하는 것보다 안정적인 코드를 만들 수 있다. 가독성 높아짐!
		// genericPrinter.setMaterial(plastic); 오류
		genericPrinter.setMaterial(powder);

		// 재료 꺼내기
		// 다운캐스팅 할 필요가 없다.
		Powder usePowder = genericPrinter.getMaterial();
		// Plastic usePowder = genericPrinter.getMaterial(); 타입 미스매치 오류
		
		// 보다 가독성 높고 안정적인 프로그래밍을 만들 수 있다.
		// 같은 변수이름 같은 기능이라면 제네릭 프로그래밍을 설계하면 된다.
	}

}
