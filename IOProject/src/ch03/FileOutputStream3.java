package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {

	public static void main(String[] args) {
		// output3.txt
		// hello world 를 찍어주세요
		FileOutputStream fos = null;
		FileInputStream fis = null;
		// 파일이 없다면 파일을 먼저 생성해준다
		try {
			fos = new FileOutputStream("output3.txt");
			fis = new FileInputStream("input.txt");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
