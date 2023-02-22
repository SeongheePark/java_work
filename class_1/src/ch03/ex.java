package ch03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ex {

	public static void main(String[] args) {
		HashSet<Integer> numberSet = new HashSet<>();
		
		while(numberSet.size() != 6) {
			numberSet.add(getRandomNum());
		}
		System.out.println(numberSet.toString());
	}

	public static int getRandomNum() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}
}