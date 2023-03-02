package ch03;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			// 현재 output.txt 파일은 없는 상태(맨 처음)
			fos = new FileOutputStream("output.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
