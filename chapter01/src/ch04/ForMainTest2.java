package ch04;

public class ForMainTest2 {

	public static void main(String[] args) {
		int num = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		// 이중 for문을 활용하여 2-9단까지 출력해주세요
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}
		
		//도전 과제 (별 찍기)
		for (int i = 1; i < 6 ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			} System.out.println("");
		}	

	} // end of main

} // end of class
