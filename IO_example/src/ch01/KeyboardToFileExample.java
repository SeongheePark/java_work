package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KeyboardToFileExample {

	public static void main(String[] args) {
//		try {
//			// 입력 스트림 준비
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			// 출력 스트림 준비
//			BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// Auto close - 자동으로 리소스를 닫아줌 (8버전 이후부터 지원)
		// 불필요하게 닫아주는 코드를 작성할 필요는 없다
		// 식은 괄호안에 작성해주면 된다.
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));) {
			// 중괄호 안에는 수행시킬 코드 작성
			System.out.println("키보드로 입력받아 데이터를 파일에다 작성하기");
			String input = reader.readLine();
			while (!(input.equals("quit"))) {
				// 파일에다가 글 작성
				writer.write(input);
				writer.newLine();
				// 키보드에서 데이터를 다시 입력받기
				input = reader.readLine();
			}
			System.out.println("출력이 완료되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
