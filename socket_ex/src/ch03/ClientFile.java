package ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

// 소켓 통신 구현
// 서버측과 클라이언트측은 통신을 통해서 데이터를 주고 받는다
// 클라이언트 측 코드
// 서버측 연결을 담당하는 포트번호를 알아야한다.
public class ClientFile {
	// final String IP = "192.168.0.85";
	final String IP = "192.168.0.86";
	Socket socket;
	BufferedWriter bufferedWriter; // 출력 스트림
	BufferedReader bufferedReader; // 입력 스트림

	public ClientFile() {
		try {
			System.out.println("1. 클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP, 11000);
			System.out.println("2. 소켓으로 연결 완료");

			// 소켓에다가 버퍼스트림 연결
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 키보드에서 값을 받아 서버측으로 문자 보내기!
			// 표준 스트림 + 보조 스트림
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("글자를 입력해주세요");
				String msg = bufferedReader.readLine();

				bufferedWriter.write(msg + "\n");
				bufferedWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}
}