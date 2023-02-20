package ch02;

public class MainTest1 {
	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		ThreePrinter3 threePrinter3 = new ThreePrinter3();
		// 재료 넣기
		threePrinter3.setMeterial(powder);
		
		// 재료 꺼내보기
		Plastic usePlastic = (Plastic)threePrinter3.getMeterial();
		
		// Object -> 다운캐스팅처리, 런타임시점에 잘못된 처리를 하게되면 예외 발생
	}
}
