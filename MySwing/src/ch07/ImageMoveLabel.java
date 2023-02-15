package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageMoveLabel extends JFrame {

	ImagePanel imagePanel;
	int imageX;
	int imageY;

	public ImageMoveLabel() {
		initData();
		setInitLayout();
		addEventListener();
	}

	class ImagePanel extends JPanel {
		private Image image;

		public ImagePanel() {
			image = new ImageIcon("images/myimage1.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 200, 200, 150, 150, null);

		}
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (imageX > 400) {
						return;
					}
					int x = imageX += 50;
					int y = imageY;
					imagePanel.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (imageX < -180) {
						return;
					}
					int x = imageX -= 50;
					int y = imageY;
					imagePanel.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (imageY < -198) {
						return;
					}
					int x = imageX;
					int y = imageY -= 50;
					imagePanel.setLocation(x, y);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (imageY > 399) {
						return;
					}
					int x = imageX;
					int y = imageY += 50;
					imagePanel.setLocation(x, y);
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

		});
	}
}
