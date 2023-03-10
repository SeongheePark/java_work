package ex10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	private BubbleFrame mContext = this; // this: 자기 자신의 주소값

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// player 메모리에 올라간 상태
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		setTitle("Bubble Game");
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);
		// 1. 부모의 주소값을 자식 객체에게 던져주는 방법 (BubbleFrame.add)
		player = new Player(mContext);
		// 2. 콜백메서드 활용 구현할 수 있다

		// 적군 생성
		enemy = new Enemy();
	}

	public Player getPlayer() {
		return this.player;
	}
	
	public Enemy getEnemy() {
		return this.enemy;
	}

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);
		add(player);
		add(enemy);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출되게 방어적코드 작성
					// if(!player.isLeft()) {
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					// player up == false down == false
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				case KeyEvent.VK_SPACE:
					player.attack();
					break;

				default:
					break;
				}
			}// end of pressed

			// ***** 자바 프로그램 중 메인함수를 가지는 클래스는
			// 프로그램에서 사용하는 모든 참조값을 알 수 있다

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player은 멈춰야한다
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player은 멈춰야한다
					player.setRight(false);
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}// end of main
}// end of class
