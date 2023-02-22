package ch03;

import java.util.HashMap;

public class MainTest3 {

	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해주세요
		// 1 - String, String
		HashMap<String, String> number = new HashMap<>();
		number.put("홍길동", "010-1234-5667");
		number.put("이순신", "010-4825-1967");
		number.put("진달래", "010-1955-0887");
		number.put("뭉치", "010-8004-1096");
		number.put("뽀삐", "010-0908-1774");
		number.put("무궁화", "010-2245-1028");
		number.put("김철수", "010-2288-4728");
		number.put("이영희", "010-0739-9096");
		number.put("초코", "010-9980-0014");
		number.put("탄이", "010-7778-1789");
		
		System.out.println(number.size());
		System.out.println(number);
		System.out.println(number.get("뽀삐"));
		// 2 - String, Object(Person)

	}

}
