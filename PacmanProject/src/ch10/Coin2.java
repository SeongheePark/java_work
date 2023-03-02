package ch10;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Coin2 extends JFrame implements Runnable {
	private BufferedImage image;
	private Coin1 coin;

	public Coin2(Coin1 coin) {
		this.coin = coin;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인!");
		}
	}

	@Override
	public void run() {

		// 색상 확인
		// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
		// 오른쪽으로 갈 때는 역시나 기준 좌표 지점을 보정해야 한다.

		// 기준 왼쪽, // 기준 오른쪽
		while(true) {
		Color coinColor = new Color(image.getRGB(coin.getX(), coin.getY()));
		for (int i = 0; i < coin.getCoins().length; i++) {
			if (coinColor.getRed() == 255 && coinColor.getGreen() == 0 && coinColor.getBlue() == 0) {
				continue;
			} else {
				coin.setLook(true);
				coin.clearCoin();
			}
		}
		
		}
	}
}
