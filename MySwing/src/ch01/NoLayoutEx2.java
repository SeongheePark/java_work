package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트들을 배치해보자
public class NoLayoutEx2 extends JFrame {
	JButton[] buttons = new JButton[6];
	String[] info = { "저장하기", "전체조회하기", "선택조회하기", "삭제하기", "변경하기", "초기화하기" };

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("버튼작업하기");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(info[i]);
			buttons[i].setSize(130, 130);
		}
	}

	private void setInitLayout() {
		setLayout(null);
		buttons[0].setLocation(250, 100);
		buttons[1].setLocation(250, 200);
		buttons[2].setLocation(250, 300);
		buttons[3].setLocation(250, 400);
		buttons[4].setLocation(250, 500);
		buttons[5].setLocation(250, 600);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
