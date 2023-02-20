package ch10;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {

	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	BufferedImage grayImage1;
	// 캐릭터 어몽어스 (적군) 이미지 1
	// jpanel 상속 --> inner class

	CustomPanel customPanel;
	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
		Thread thread = new Thread(customPanel);
		thread.start();

		// 줄이면
		// new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_Image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_Image1.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다");
			e.printStackTrace();
		}
		// 메모리에 올라가는 순간 paintComponent() 메서드 호출
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		// add 호출 시 paintComponent 실행됨
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	class CustomPanel extends JPanel implements Runnable {
		boolean isRight = true;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {
				if (isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}

				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				}
				if (grayX == -20) {
					isRight = true;
				}
				

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
		}
	}// end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println(keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			pinkX = (pinkX > 500) ? 510 : pinkX + 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			pinkY = (pinkY < 0) ? -10 : pinkY - 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			pinkY = (pinkY > 470) ? 480 : pinkY + 10;
		}
		// 그림을 다시 그려주다 실행
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}// end of outer class
