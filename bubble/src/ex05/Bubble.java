package ex05;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import ex06.PlayerWay;

public class Bubble extends JLabel implements Movable{
	// 버블 위치 상태
	private int x;
	private int y;

	// 버블 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 - 0:기본물방울 1:적을 가둔 물방울
	private int state;

	private ImageIcon bubble; // 기본
	private ImageIcon bubbled; // 적을 가둠
	private ImageIcon bomb; // 터짐

	private Player player;

	// 버블 Player에 의존하고 있다
	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		initThread();
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야한다
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
		
	}
	private void initThread() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (player.getpWay() == PlayerWay.LEFT) {
					// 왼쪽 발사
					left();
				} else {
					// 오른쪽으로 발사
					right();
				}

			}
		}).start();
	}

	@Override
	public void left() {
		left = true;
		for(int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void right() {

	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}
}

