package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	public static void main(String[] args) {
		FileWriter fw = null;
		char[] buf = { '반', '갑', '습', '니', '다' };
		try {
			fw = new FileWriter("writer1.txt");
			// fw.write('H'); // 문자 하나만 출력 --> File
			// fw.write(buf); // 문자 배열 파일에 출력
			fw.write(buf, 1, 2); // 대상, 인덱스 시작값(어디부터 시작), 인덱스 길이(어디까지)

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
