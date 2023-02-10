package ch06;

public class MainTest1 {
	// 1. return값 int / 매개변수 n1 n2 n3 이름은 intAdd
	// 2. return값 double / 매개변수 n1 n2 이름은 doubleAdd
	// 3. return값 void / 매개변수 String article 이름은 printArticle

	static int intAdd(int n1, int n2, int n3) {
		return n1 + n2 + n3; // 매개변수 활용 연산 후 바로 리턴
	}

	static double doubleAdd(double n1, double n2) {
		return n1 + n2;
	}

	static void printArticle(String article) {
		System.out.println(article);
	}

	// 테스트-실행코드 main
	public static void main(String[] args) {
		System.out.println(intAdd(3, 4, 5));
		System.out.println(doubleAdd(4, 5));
		// 오류 발생
//		System.out.println(printArticle("반가워!"));
		printArticle("반가워!");

	}
}
