package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle {

	public static void main(String[] args) {
		// 파일 입출력을 활용해서 코드 작성해주세요
		// 입력 대상 : article1.txt
		// 출력 대상 : today_article.txt
		
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article1.txt");
			fw.write("MVC뉴스\n");
			int i;
			while ((i = fr.read()) != -1) {
				fw.write((char) i);	
			}
			fw.write("\n작성자: 홍길동");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} 
}
