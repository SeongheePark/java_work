package ex11;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Movable {

	// 버블에 위치 상태
	private int x;
	private int y;

	// 버블에 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태 : 0 기본, 1, (적을 가둔 물방울)
	private int state;

	private ImageIcon bubble; // 기본 물방울 이미지
	private ImageIcon bubbled; // 적을 가둔 상태 이미지
	private ImageIcon bomb; // 물방울이 터진 상태 이미지

	private BubbleFrame mContext;
	private BackgroundBubbleService backgroundBubbleService;

	// 버블을 Player에 의존하고 있다.
	public Bubble(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);
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
		// 플레이어가 있는 위치에 태어나야 한다.
		x = mContext.getPlayer().getX();
		y = mContext.getPlayer().getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (mContext.getPlayer().getpWay() == PlayerWay.LEFT) {
					// 왼쪽 방향을 보고 있다.
					left();
				} else {
					right();
				}
			}
		}).start();
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			// 체크 (왼쪽 벽인지?) --> break;
			if (backgroundBubbleService.leftWall()) {
				// true
				break;
			}
			// 적군 위치 감지 - 범위값 계산 --> +- --> 절대값 구하기
			// 적군의 x, y값
			mContext.getEnemy().getX();
			// 절대값 계산
			// 물방울의 x 좌표 값이 100 . 적군의 x 좌표 값이 150
			if (Math.abs(x - mContext.getEnemy().getX()) < 10 && Math.abs(y - mContext.getEnemy().getY()) < 50) {
				if (mContext.getEnemy().getState() == 0) {
					crash();
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			mContext.getEnemy().getX();
			// 절대값 계산
			// 물방울의 x 좌표 값이 100 . 적군의 x 좌표 값이 150
			if (Math.abs(x - mContext.getEnemy().getX()) < 10 && Math.abs(y - mContext.getEnemy().getY()) < 50) {
				// 적군이 살아있는 상태에만 crash() 호출 시킬 예정
				if (mContext.getEnemy().getState() == 0) {
					crash();
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while (true) {
			y--;
			setLocation(x, y);
			if (backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		clearBubble();
	}

	private void clearBubble() {
		try {
			Thread.sleep(3000);
			setIcon(bomb);
			Thread.sleep(500);
			setIcon(null);
			// repaint();
			// this.setVisible(false); 써도 가능. 하지만 메모리는 남아있고 화면에만 안보임!
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void crash() {
		mContext.getEnemy().setState(1);
		state = 1;
		setIcon(bubbled);
		// heap 메모리에서는 아직 남아있다 (가비지컬렉터가 알아서 제거해준다)
		mContext.remove(mContext.getEnemy());
		mContext.repaint();
	}

}
