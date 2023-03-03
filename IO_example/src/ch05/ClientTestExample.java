package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTestExample {
	Socket socket;
	final int PORT = 11203;
	final String IP = "localhost";
	BufferedReader keyboardReader;
	BufferedWriter writer;

	BufferedReader socketReader;

	public ClientTestExample() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new Thread(new ReadThread()).start();
			while (true) {
				System.out.println("키보드로 입력 대기");
				String msg = keyboardReader.readLine();
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				keyboardReader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class ReadThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					String msg = socketReader.readLine();
					System.out.println("서버 >>" + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {
		new ClientTestExample();
	}
}
