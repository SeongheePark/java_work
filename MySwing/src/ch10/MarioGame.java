package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarioGame extends JFrame implements KeyListener {
	BufferedImage background;
	BufferedImage Mario_l;
	BufferedImage Mario_r;
	CustomPanel customPanel;
	int marioX = 850;
	int marioY = 270;

	public MarioGame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마리오게임");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			background = ImageIO.read(new File("images/background_img.jpg"));
			Mario_l = ImageIO.read(new File("images/mario_left.png"));
			//Mario_r = ImageIO.read(new File("images/mario_right.png"));
		} catch (IOException e) {
			System.out.println("파일이 없어요!");
			e.printStackTrace();
		}
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this);

	}

	class CustomPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(Mario_l, marioX, marioY, 100, 100, null);
			//g.drawImage(Mario_r, marioX, marioY, 100, 100, null);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			marioX = (marioX < 10) ? 0 : marioX - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			
			marioX = (marioX > 880) ? 890 : marioX + 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			marioY = (marioY < 10) ? 0 : marioY - 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			marioY = (marioY > 260) ? 270 : marioY + 10;
		}
		// 그림을 다시 그려주다 실행
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
