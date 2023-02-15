package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {
	ImagePanel imagePanel;

	// 정적 - 내부 클래스
	static class ImagePanel extends JPanel {
		Image[] images = new Image[6];

		public ImagePanel() {
			images[0] = new ImageIcon("image3.png").getImage();
			images[1] = new ImageIcon("image41.png").getImage();
			images[2] = new ImageIcon("image51.png").getImage();
			images[3] = new ImageIcon("image61.png").getImage();
			images[4] = new ImageIcon("image71.png").getImage();
			images[5] = new ImageIcon("image81.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(images[0], 100, 100, 100, 100, null);
			g.drawImage(images[1], 200, 200, 200, 200, null);
			g.drawImage(images[2], 100, 400, 300, 150, null);
			g.drawImage(images[3], 80, 200, 150, 150, null);
			g.drawImage(images[4], 200, 600, 100, 100, null);
			g.drawImage(images[5], 300, 100, 100, 100, null);
		}

	}

	public MyImageFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}
}
