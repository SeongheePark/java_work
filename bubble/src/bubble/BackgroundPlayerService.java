package bubble;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable {
	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY()));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY()));
			
			int bottomColorLeft = image.getRGB(player.getX() + 25, player.getY() + 55);
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			
			if(bottomColorLeft+bottomColorRight != -2) {
				player.setDown(false);
			} else {
				if(player.isUp() == false && player.isDown() == false) {
					player.down();
				}
			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("벽에 충돌");
				player.setRight(false);
				player.setRightWallCrash(true);
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		}
	}

}
