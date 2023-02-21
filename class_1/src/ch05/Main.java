package ch05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		A a = new A();

		// 문제
		// d object에 있는 value 값을 화면에 출력해주세요!
		System.out.println(a.b.c.d.value);
		System.out.println(a.b.c.d.arrayList);
		
		ArrayList<String> temp = a.b.c.d.arrayList;
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(temp.get(i));
		}

	}

}
