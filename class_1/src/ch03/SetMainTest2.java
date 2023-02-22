package ch03;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {

	public static void main(String[] args) {
		HashSet<Integer> numberSet = new HashSet<>();
		
		// 무조건 6개 사이즈를 가지는 numberSet을 구성하세요 
		int count = 0;
		while(numberSet.size() != 6) {
			numberSet.add(getRandomNumber());
		}
		System.out.println(numberSet.toString()); 
		
	}// end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	} 
}// end of class
