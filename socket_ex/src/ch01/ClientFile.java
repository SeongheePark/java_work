package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//소켓 통신 구현
//서버측과 클라이언트측은 통신을 통해서 데이터를 주고 받는다
//클라이언트 측 코드
//서버측 연결을 담당하는 포트번호를 알아야한다.
public class ClientFile {
	// final String IP = "192.168.0.85";
	final String IP = "localhost";
	Socket socket;

	public ClientFile() {
		try {
			System.out.println("클라이언트 소켓 프로그램 시작");
			socket = new Socket(IP, 11000);
			System.out.println("소켓으로 연결 완료");

			// 키보드에서 데이터 입력 --> 입출력 stream
			// 키보드 연결 스트림 생성
			InputStreamReader reader = new InputStreamReader(System.in);
			// 확장 - 보조 스트림 추가
			BufferedReader bufferedReader = new BufferedReader(reader);
			System.out.println("키보드 입력 대기: ");
			String keyboardMsg = bufferedReader.readLine(); // enter키 칠 때까지 !
			// 데이터 보내주기 -> 출력스트림 사용!
			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			// 확장 - 보조 스트림
			BufferedWriter bufferedWriter = new BufferedWriter(osw);
			bufferedWriter.write("keyboardMsg: " + keyboardMsg + "\n");
			// 중요!!!!! 메세지에 끝을 알려주어야 한다.
			bufferedWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientFile();
	}
}
