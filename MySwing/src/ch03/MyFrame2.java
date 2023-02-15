package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	// 내부 클래스를 활용해서 JPanel 상속받고 paint 메서드로 집 그림 그리기
	MyDrawPanel drawpanel;

	class MyDrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(150, 350, 200, 200);
			g.drawLine(250, 200, 150, 350);
			g.drawLine(250, 200, 350, 350);
			g.drawRect(210, 380, 80, 80);
			g.drawLine(250, 380, 250, 460);
			g.drawLine(210, 420, 290, 420);
			g.drawOval(400, 100, 50, 50);
			g.drawLine(390, 130, 340, 130);
			g.drawLine(460, 130, 500, 130);
			g.drawLine(420, 90, 420, 50);
			g.drawLine(420, 160, 420, 190);
			g.drawString("우리집", 230, 340);
			g.drawLine(350, 350, 350, 220);
			g.drawLine(300, 220, 300, 275);
			g.drawLine(300, 220, 350, 220);
			g.drawOval(300, 180, 30, 30);
			g.drawOval(270, 130, 40, 40);
			g.drawOval(220, 80, 50, 50);
		}
	}

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집만들기~!");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawpanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawpanel);
		setVisible(true);
	}
}
