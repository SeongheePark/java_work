package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {
		// 책을 저장하는 기능을 만들고 정보를 출력하는 프로그램을 만들어주세요
		// while문 사용 1.저장 2.전체조회 3.선택조회 4.전체삭제 5.프로그램종료
		int count = 0;
		Book[] books1 = new Book[100];
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		String searchBook;

		while (choice != 5) {
			System.out.println("원하는 항목을 선택해주세요!\n1.저장\t2.전체조회\t3.선택조회\t4.전체삭제\t5.프로그램종료");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("저장하려는 책 제목을 입력해주세요!");
				String newBook = sc.nextLine();
				books1[count] = new Book(newBook);
				System.out.println(newBook + (count + 1) + " 번째로 저장했습니다!");
				count++;
			} else if (choice == 2) {
				System.out.println("저장하신 모든 책 목록을 조회합니다.");
				for (int i = 0; i < books1.length; i++) {
					if (books1[i] != null) {
						books1[i].showInfo();
					}
				}
			} else if (choice == 3) {
				System.out.println("조회하려는 책 제목을 입력해주세요!");
				searchBook = sc.nextLine();
				boolean isFine = false; 
				for (int i = 0; i < books1.length; i++) {
					if(books1[i] != null) {
						// 0  1  2 
						//  
						if (searchBook.equals(books1[i].getTitle())) {
							System.out.println(searchBook + "은 " + (i + 1) + "번째로 저장된 책입니다!");
							isFine = true;
							break;
						} 
					}
				}
				if(isFine == false) {
					System.out.println("저장되지 않은 책입니다!");
				}
			} else if (choice == 4) {
				System.out.println("저장하신 모든 책을 삭제합니다.");
				for (int i = 0; i < books1.length; i++) {
					books1[i] = null;
					count = 0;
				}
			}
		}
	}
}
