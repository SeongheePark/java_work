package ch06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("data.txt");
			// 보조 기반 스트림 활용
			DataOutputStream dos = new DataOutputStream(fos);
			
			//dos.write(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test UTF");
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 데이터 단위로 읽어보자
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("Data.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// end of main

}
