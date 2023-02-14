package ch02;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트들을 배치해보자
public class NoLayoutEx2 extends JFrame {
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("버튼작업하기");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("저장하기");
		button2 = new JButton("전체조회하기");
		button3 = new JButton("선택조회하기");
		button4 = new JButton("삭제하기");
		button5 = new JButton("변경하기");
		button6 = new JButton("초기화하기");
		button1.setSize(100,100);
		button2.setSize(100,100);
		button3.setSize(100,100);
		button4.setSize(100,100);
		button5.setSize(100,100);
		button6.setSize(100,100);
	}

	private void setInitLayout() {
		setLayout(null);
		button1.setLocation(250, 100);
		button2.setLocation(250, 200);
		button3.setLocation(250, 300);
		button4.setLocation(250, 400);
		button5.setLocation(250, 500);
		button6.setLocation(250, 600);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
