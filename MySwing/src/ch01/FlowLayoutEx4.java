package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {
	// 멤버 변수 선언
	private JButton[] buttons = new JButton[5];

	// 생성자는 메모리에 올라갈 때 처음 실행되는 코드, 구현부 안에서의 순서도 중요!
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("배열활용");
		setSize(600, 600);

		// static변수나 static함수는 클래스 이름으로도 접근 가능하다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}

	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (int i = 0; i < buttons.length; i++) {
			// 방어적 코드 작성 염두!
			add(buttons[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx4();
	}
}
