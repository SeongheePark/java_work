package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {
	private JTextArea area;

	public MyKeyEvent1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가 설정
		area = new JTextArea();
	}

	private void setInitLayout() {
		add(area);
		setVisible(true);
	}

	private void addEventListener() {
		KeyListener keylistener;
		area.addKeyListener(this);
	}

	// 문자를 반응한다.
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped: " + e.toString());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed: " + e.toString());
		// 제어문을 활용해서 방향키 위 가 눌러졌으면 콘솔에 up 이라는 문자열을 출력
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("방향키 위\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("방향키 아래\n");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("방향키 왼쪽\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("방향키 오른쪽\n");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
