package ch09;

import java.util.Scanner;

public class BookStoreManager3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 배열의 길이 지정
		Book[] books = new Book[100];
		boolean flag = true;
		int lastIndexNumber = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// to do 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// 실행 흐름 만들어보기
		while (flag) {
			System.out.println("**메뉴선택**");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.종료");
			String selectedNumber = scanner.nextLine();
			if (selectedNumber.equals(SAVE)) {
				lastIndexNumber = save(scanner, books, lastIndexNumber);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readByTitle(scanner, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				flag = false;
			} else {
				System.out.println("잘못된 입력 값 입니다.\n다시 선택바람");
			}
		}
	}

	// 저장하기 기능
	public static int save(Scanner scanner, Book[] books, int lastIndexNumber) {
		System.out.println(">>저장하기<<");
		System.out.println("책 제목을 입력하세요\n");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요\n");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[lastIndexNumber] = book;
		lastIndexNumber++;
		System.out.println(bookTitle + " 책을 저장했습니다!");
		return lastIndexNumber;
	}

	// 전체 조회하기 기능
	public static void readAll(Book[] books) {
		System.out.println(">>전체조회하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}
		}
		System.out.println();
	}

	// 선택 조회하기 기능
	public static void readByTitle(Scanner scanner, Book[] books) {
		System.out.println(">>선택조회하기<<");
		System.out.println(">>책 제목을 입력해주세요<<");
		String bookTitle = scanner.nextLine();
		boolean isFined = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
					isFined = true;
					break;
				}
			}
		}
		if (isFined == false) {
			System.out.println("아쉽지만 없는 책입니다.");
		}
	}

	// 전체 삭제하기 기능
	public static void deleteAll(Book[] books) {
		System.out.println(">>전체삭제하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}
}
