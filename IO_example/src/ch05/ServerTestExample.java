package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTestExample {
	ServerSocket serverSocket;

	Socket socket;
	BufferedReader reader;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardReader;

	public ServerTestExample() {
		initData();
	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(11203);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			WriterThread writerThread = new WriterThread();
			Thread thread = new Thread(writerThread);
			thread.start();
			
			while (true) {
				String input = reader.readLine();
				System.out.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class WriterThread implements Runnable {

		@Override
		public void run() {
			while(true) {
				try {
					String msg = keyboardReader.readLine();
					bufferedWriter.write(msg);
					bufferedWriter.newLine();
					bufferedWriter.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {
		new ServerTestExample();
	}
}
