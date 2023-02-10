package ch04;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		// 값을 입력받아 모두 더한 값을 출력해주세요! (0을 입력받으면 종료)
		int num = 1;
		int sum = 0;
		final int USER_INPUT ;
		System.out.println("값을 입력해주세요!");
		Scanner scanner = new Scanner(System.in);
		USER_INPUT = scanner.nextInt();
		while(num <= USER_INPUT) {
			sum += num;
			num++;
		} 
		System.out.println("연산된 값은: "+sum+" 입니다");
	}

}
