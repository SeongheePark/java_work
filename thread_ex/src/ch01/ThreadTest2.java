package ch01;

public class ThreadTest2 {
	// main thread
	public static void main(String[] args) {
		// 사용 방법
		// 현재 thread가 누군지 알아보는 명령어
		System.out.println("---main thread 시작---");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어내기(main thread가 일함)
		Worker worker1 = new Worker("worker1");
		worker1.start();

		// thread 하나 더 생성해보기
		Worker worker2 = new Worker("worker2");
		worker2.start();

		System.out.println("---main thread 종료---");
	} // end of main
}// end of class

// thread 만들어보기
// 상속 활용해서 쓰레드 만들어보기 (작업자 만들어 보기)
// thread를 상속한 클래스. 즉 Worker는 thread이기도 하다 (다형성)

