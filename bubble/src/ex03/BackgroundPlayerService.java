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
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

			// 바닥 충돌 감지 기능
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10,
			// player.getY() + 60));
			// -66546, -16776961, -1
			int bottomColorLeft = image.getRGB(player.getX() + 25, player.getY() + 55);
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			// 하얀색이 아니면 바닥이다
			if (bottomColorLeft + bottomColorRight != -2) {
				System.out.println("여기는 바닥입니다");
				player.setDown(false);
			} else {
				// 조금 점프하는 순간 bottomColorLeft -> -1이 된다
				// 위 화살표 누르면 현재 65번 반복돌면서 y값을 마이너스해서 이미지를 위로 올리고 있고 현재 y좌표에서 +130 올리고 있고->
				// down메서드 호출
				// 올라가는 동시에 위+위+위+ 누르면 계속 Thread 생성 65*3번 반복 > 여러번 누르더라도 한번만 동작하게!
				if (player.isUp() == false && player.isDown() == false) {
					// 다운 메서드가 한번 호출되어야한다.
					player.down();
				}
			}

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
				Thread.sleep(3);
			} catch (InterruptedException e) {
			}

		} // end of while
	}
}
