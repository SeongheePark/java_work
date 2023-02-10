package ch09;

public class BookMainTest1 {

	public static void main(String[] args) {
		// 연관된 하나의 데이터 통으로 관리하고 싶다면 - 배열 (자료구조)
		Book[] books = new Book[5]; // 배열 선언(메모리 공간 만들어두기)
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// books[5] = new Book("홍길동전","허균"); > 범위를 벗어나 오류.

		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle());
			}
		}
		// 주의할 점

		// 인덱스 크기는 n-1개다.
		// 배열의 길이와 인덱스의 길이는 다르다.

		// 배열의 길이와 실제 들어가있는 값의 갯수는 다를 수 있다.

		// 문제
		// double 배열 4 선언 임의 값 넣고 for문으로 출력해주세요
		// 4번째 인덱스는 값을 할당하지 마세요
		double[] books1 = new double[4];
		books1[0] = 1.0;
		books1[1] = 2.33;
		books1[2] = 55.2;

		for (int i = 0; i < books1.length; i++) {
			if (books1[i] != 0.0) {
				System.out.println(books1[i]);
			}
		}

		// 0번째 인덱스와 2번째 인덱스 값을 스왑해주세요!
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;

		// 인덱스 3번의 값을 삭제해주세요!
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();
			}
		}
	}
}
