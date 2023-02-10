package ch04;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 사용자의 정수값을 입력 받아서 배수에 갯수를 출력하는 프로그램을 만들어보세요
		// 테스트 값 : 1000
//		System.out.println("정수값을 입력해주세요!");
//		Scanner sc = new Scanner(System.in);
//		int USER_INPUT;
//		int num = 0;
//		USER_INPUT = sc.nextInt();
//		
//		for (int i = 1; i < 1001; i++) {
//			if(i % USER_INPUT != 0) {
//				continue;
//				num += i;
//			}
//			System.out.println("배수는: "+num+" 개 입니다");
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 값을 입력해주세요");
		final int MULTIPLE = sc.nextInt();
		System.out.println("몇 까지 확인하겠습니까?");
		final int MAX = sc.nextInt();;
		int num = 0;
		int count = 0;
		
		for(num=1; num<=MAX; num++) {
			if(num % MULTIPLE == 0) {
				count++;
				continue;
			}
//			System.out.println("num: "+num);
		}
		System.out.println(MULTIPLE+"의 배수의 갯수는"+count+"입니다");

	} //end of main

} // end of class
