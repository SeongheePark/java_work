package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "홍길동전", "허균");
		Book book4 = new Book(4, "홍길동전", "허상");

		String str1 = new String("허균");
		boolean result0 = str1.equals("홍길동");

		boolean result1 = book1.equals(book2);
		System.out.println(result1);
		boolean result2 = book2.equals(book2);
		System.out.println(result2);
		boolean result3 = book3.equals(book2);
		System.out.println(result3);

		if (book3.equals(book4)) {
			System.out.println("논리적으로 같은 책입니다");
		} else {
			System.out.println("논리적으로 다른 책입니다");
		}
	}

}
