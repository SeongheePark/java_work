package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;

	private int JUMPCOUNT = 0;
	private int FIRST = 0; // 바닥도착 : 0 , 꼭대기 : 1
	private int BOTTOMCOLOR = -1;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인!");
		}
	}

	@Override
	public void run() {
		while (enemy.getState() == 0) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때는 역시나 기준 좌표 지점을 보정해야 한다.

			// 외벽 충돌 확인
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));
			// 꼭대기 도착
			// 오른쪽 구석
			// 왼쪽 구석

			// 바닥 충돌 감지
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10,
			// player.getY() + 60));
			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 55);
			int bottomColorRight = image.getRGB(enemy.getX() + 40, enemy.getY() + 55);
			// -1 공중 상태
			if (bottomColorLeft + bottomColorRight != -2) {
				enemy.setDown(false);
			} else {

			}

		} // end of while
	}

}
