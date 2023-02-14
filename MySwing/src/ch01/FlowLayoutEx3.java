package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 배치 관리자 연습 - FlowLayout
// components 수평 수직으로 배치해준다
public class FlowLayoutEx3 extends JFrame {
	JButton[] buttons = new JButton[8];
	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JButton");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+(i+1));
		}
		
		flowLayout = new FlowLayout(flowLayout.RIGHT, 20, 20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}

	// 테스트
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
