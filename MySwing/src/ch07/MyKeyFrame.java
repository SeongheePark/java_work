package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame implements KeyListener {
	// 1.구현처리
	// 2.익명 클래스
	private JTextArea textarea;

	@Override
	public void keyTyped(KeyEvent e) {
		textarea.getText();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.toString());
		if(e.getKeyChar() == '1') {
			System.out.println("1을 눌렀어요!");
		}else if(e.getKeyChar() == '2') {
			System.out.println("2를 눌렀어요!");
		}else if(e.getKeyChar() == '3') {
			System.out.println("3을 눌렀어요!");
		}else if(e.getKeyChar() == '4') {
			System.out.println("4를 눌렀어요!");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textarea = new JTextArea();
	}

	private void setInitLayout() {
		add(textarea);
		setVisible(true);
	}

	private void addEventListener() {
		textarea.addKeyListener(this);
	}

}
