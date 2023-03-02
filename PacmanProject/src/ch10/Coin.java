package ch10;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Coin extends JFrame {

	private JLabel backgroundMap;
	// 이미지
	//private JLabel[] coins = new JLabel[12];
	private Coin1 coin;
	private Coin mContext = this;

	// 위치
	private int x = 5;
	private int y = 45;

	public Coin() {
		initData();
		setInitLayout();
		new Thread(new Coin2(coin)).start();
	}

	private void initData() {
		setTitle("팩맨");
		setSize(800, 800);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMapService.png"));
		setContentPane(backgroundMap);
//		for (int i = 0; i < coins.length; i++) {
//			coins[i] = new JLabel(new ImageIcon("images/bigDot.png"));
//			coins[i].setSize(50,50);
//		}
		coin = new Coin1(mContext);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
//		for (int i = 0; i < coins.length; i++) {
//			coins[i] = new JLabel(new ImageIcon("images/bigDot.png"));
//			coins[i].setSize(50, 50);
//			add(coins[i]);
//			coins[i].setLocation(x, y);
//			x += 50;
//		}
	}

	public static void main(String[] args) {
		new Coin();
	}
}
