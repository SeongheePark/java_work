package ch01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coin1 extends JFrame {

	private JLabel backgroundMap;
	Coin mContext;
	// 이미지
	private JLabel[] coins = new JLabel[12];

	// 위치
	private int x = 5;
	private int y = 45;

	// 상태
	private boolean isLook;

	public Coin1(Coin mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

	public boolean isLook() {
		return isLook;
	}

	public void setLook(boolean isLook) {
		this.isLook = isLook;
	}
	

	public JLabel getBackgroundMap() {
		return backgroundMap;
	}

	public void setBackgroundMap(JLabel backgroundMap) {
		this.backgroundMap = backgroundMap;
	}

	public JLabel[] getCoins() {
		return coins;
	}

	public void setCoins(JLabel[] coins) {
		this.coins = coins;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private void initData() {
		setTitle("팩맨");
		setSize(800, 800);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMapService.png"));
		setContentPane(backgroundMap);
//		for (int i = 0; i < coins.length; i++) {
//			coins[i] = new JLabel(new ImageIcon("images/bigDot.png"));
//			coins[i].setSize(50, 50);
//		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		isLook = false;
	}

	private void setInitLayout() {
		setLayout(null);
//		for (int i = 0; i < coins.length; i++) {
//			add(coins[i]);
//			coins[i].setLocation(x, y);
//			x += 50;
//		}
		setResizable(false);
		setVisible(true);
	}

	public void clearCoin() {
		isLook = true;
		for (int i = 0; i < coins.length; i++) {
			coins[i] = new JLabel(new ImageIcon("images/bigDot.png"));
			coins[i].setSize(50, 50);
			add(coins[i]);
			coins[i].setLocation(x, y);
			x += 50;
		}
	}

//	public static void main(String[] args) {
//		new Coin1();
//	}
}
