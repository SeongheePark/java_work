package ch01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 서버측 만들 때 서버 소켓을 준비
// 소켓은 양끝단에 포트 번호를 달아야한다
// 0 ~ 65335 번까지 포트번호 사용할 수 있다
// 그 중에 0 ~ 1023 번 포트 번호까지는 잘 알려진 포트 번호라서 가능한 사용 안하는게 좋다.
public class ServerFile {
	// 클라이언트 연결만 받는 소켓
	ServerSocket serverSocket;
	// 실제 통신을 하는 소켓
	Socket socket;

	public ServerFile() {
		System.out.println(">>>1. 서버 소켓 시작<<<");
		try {
			// 서버 소켓 포트번호와 함께 생성
			serverSocket = new ServerSocket(11000);
			// 누군가 접속하기 위해서 대기
			socket = serverSocket.accept(); // 클라이언트 접속 대기중
			// 클라이언트가 연결되면 통신을 담당하는 socket을 생성 (랜덤 포트번호 생성)
			System.out.println("2. 클라이언트 연결 완료");
			System.out.println("-----------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of constructor

	public static void main(String[] args) {
		new ServerFile();
	}
}
