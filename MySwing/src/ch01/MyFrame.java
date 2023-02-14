package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		// super 부모의 메서드
		setTitle("MyFrame01");
		// width, height
		setSize(200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new MyFrame();
		// GUI 관련 프로그램 학습시에 배치 관리자 먼저 명확히 이해하는 것이 좋다
		// 레이아웃 --> Button 
	}
}
