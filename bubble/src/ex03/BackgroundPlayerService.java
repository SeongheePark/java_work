package ex03;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 백그라운드에서 계속 player에 움직임을 관찰
public class BackgroundPlayerService implements Runnable {
	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 객체에 사용하는 이미지 경로 및 파일명 확인");
		}
	}

	@Override
	public void run() {
		// 색상확인
		// 왼쪽 -> 좌표 지점 보정 오른쪽 - > 기준 좌표 지점 보정
		while (true) {
			Color leftColor = new Color(image.getRGB(player.getX() + 5, player.getY()));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY()));
			// 왼쪽 벽 충돌 감지
			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("왼쪽 벽에 충돌했어요!");
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽 벽 충돌!");
				player.setRight(false);
				// 벽에 충돌했다
				player.setRightWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
			}

		} // end of while
	}
}
