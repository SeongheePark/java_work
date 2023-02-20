package ch01;

public class ThreadTest1 {
	// main thread
	public static void main(String[] args) {
		// 작업에 단위 thread 동작
		for (int i = 0; i < 30; i++) {
			//System.out.print("i: " + i + "\t");
			System.out.print("-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of main

}// end of class
