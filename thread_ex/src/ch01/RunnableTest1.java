package ch01;

import javax.swing.JFrame;

public class RunnableTest1 {

	// 만약 코드가 JFrame을 상속 받았다면 자바는 단일 상속을 지원하기 때문에 다중 상속을 할 수 없다.
	// 그래서 인터페이스인 Runnable 구현 방법을 알아야한다.
	public static void main(String[] args) {
		// 사용방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
		// thread 기능인 start 메서드가 없는 상태
		// subWorker.start(); <-- 현재 start 메서드가 없다..! Runnable기능만 구현, Thread를 상속받은건 아님
		// thread 생성 시 생성자에 runnable 타입을 넣을 수 있다고 확인 - 문서, 코드 힌트
		Thread thread1 = new Thread(subWorker);
		thread1.start();
	}

}

class SubWorker extends JFrame implements Runnable {

	// 설계 방법
	// 나중에 thread가 동작해야 하는 부분을 run안에서 작성함
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print("i: " + i + "\n");
		}

	}

}
