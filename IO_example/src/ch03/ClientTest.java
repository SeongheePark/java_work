package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;

public class ClientTest {
	// 통신을 하기 위해 소켓 필요 + 주소(ip) + 포트번호
	Socket socket;
	final String IP = "localhost";
	final int PORT = 10000;
	BufferedReader reader;
	BufferedWriter writer;

	public ClientTest() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			// 클라이언트와 서버 연결 완료

			// 키보드에서 데이터를 입력 받기
			reader = new BufferedReader(new InputStreamReader(System.in));

			// 소켓 통신을 통해서 데이터를 출력
			// 출력 스트림 연결 : 대상 -> 소켓
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = reader.readLine(); // 키보드에서 데이터 입력 받음
				writer.write(input);
				writer.newLine(); // 문장의 끝을 알려주어야 한다.
				writer.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ClientTest();
	}
}
