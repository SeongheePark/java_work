package ch01;

public class Worker extends Thread{
		private String name;

		public Worker(String name) {
			this.name = name;
		}

		// 약속된 부분
		// start 메서드를 통해서 thread한테 일 시작해!라고 명령을 줄 수 있다.
		// 그러면 thread는 run 메서드 안에 있는 부분을 수행시킨다.
		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
				System.out.println(name + " : " + i+"\t"+Thread.currentThread());

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}// end of run
}
