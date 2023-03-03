package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		// 글자를 만들어두고 파일에다가 출력하기
		// 출력스트림이 필요하다. 파일-문자 + 보조스트림
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output1.txt"));
			writer.write("Hello world");
			writer.newLine(); // 한줄 띄우는 명령어
			writer.write("안녕하세요");
			// 물을 내려주는게 좋다
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// end of main

}
