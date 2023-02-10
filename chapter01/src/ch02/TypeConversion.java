package ch02;

public class TypeConversion {
	// 코드의 시작점 main함수
	
	/** 여러줄 주석 만드는 법
	 * 
	 */
	public static void main(String[] args) {
		 	//형변환
			//자동 형 변환 , 강제 형 변환
			int iNumber1= 100;
			System.out.println(iNumber1);
			
			// 묵시적 형 변환 또는 자동 형 변환
			double dNumber1 = iNumber1;
			// 형이 변환되었기 때문에 자신에게 맞는 형태로 출력됨
			System.out.println(dNumber1);  // 100.0
			
			// 쌍따옴표 - 문자열이라고 한다 ()
			System.out.println("================================");
			
			//강제 형 변환
			// 강제 형 변환의 주의점 : 강제로 변환하다보니 데이터 손실이 생길 수 있다.
			double dNumber2 = 0.0012345;
			System.out.println(dNumber2);
			int iNumber2 = (int)dNumber2; //개발자가 컴파일러에게 괜찮으니 강제로 넣어! 하며 강제로 형 변환
			System.out.println(iNumber2);  //0
			
			//강제 형 변환 시, 소수점 단위는 그냥 버려버림 (내림)
			int iNumber3 = (int)10.95; 
			System.out.println(iNumber3);
			
			double a;
			int b;
			//1. a에 값 0.5를 담아보세요
			a = 0.5;
			//2. b에 값 10.5 리터럴 값을 담아보세요
			b = (int)10.5;
			
	}  // end of main

}  //  end of class
