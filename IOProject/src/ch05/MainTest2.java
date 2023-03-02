package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		long millisecond = 0;

		// 1단계
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubblecopy.zip");
			int i;
			millisecond = System.currentTimeMillis();
			while ((i = fis.read()) != -1) {
				// i 공간 안에 읽어들이는 중
				fos.write(i); // 쓰는중
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 시 소요시간 : " + millisecond);
	}

}
