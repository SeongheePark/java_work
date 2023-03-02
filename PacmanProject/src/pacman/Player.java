package pacman;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	
	// player 좌표
	private int x;
	private int y;
	
	// player 이미지
	private ImageIcon playerR;
	private ImageIcon playerL;
	private ImageIcon playerU;
	private ImageIcon playerD;
	
	// player 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	//player 속도 상태
	private final int SPEED = 5;
	
	public Player() {
		playerR = new ImageIcon("images/PacmanR.png");
		playerL = new ImageIcon("images/PacmanR.png");
		playerU = new ImageIcon("images/PacmanR.png");
		playerD = new ImageIcon("images/PacmanR.png");
	}
	private void initData() {
		
	}
	private void setInitLayout() {
		
	}
	public void left() {
		while(left) {
			x = x - SPEED;
			setLocation(x, y);
		}
	}
	public void right() {
		while(right) {
			x = x + SPEED;
			setLocation(x, y);
		}
	}
	public void up() {
		while(up) {
			y = y - SPEED;
			setLocation(x, y);
		}
	}
	public void down() {
		while(down) {
			y = y + SPEED;
			setLocation(x, y);
		}
	}
}
