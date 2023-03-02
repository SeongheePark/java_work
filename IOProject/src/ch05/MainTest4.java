package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {
		// 기반 + 보조 스트림 (자료형 문자단위)
		FileReader fileReader = null;
		FileWriter writer = null;
		int count = 0;
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			// 보조스트림을 이용해 한줄씩 글자를 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			// 파일 출력
			writer = new FileWriter("myText.txt");
			// 한줄씩 읽는 기능 .readLine()
			writer.write(bufferedReader.readLine());
			writer.flush();
			int i;
			// 기반 스트림 사용 (자료대상: 문자열)
//			while ((i = fileReader.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}
			//bufferedReader.read();
//			while ((i = bufferedReader.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("반복횟수: " + count);
	}
}
