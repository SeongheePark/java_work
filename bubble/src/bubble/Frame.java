package bubble;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
	private JLabel backgroundMap;
	
	public Frame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("Bubble Game");
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setSize(1000,640);
	}
	private void setInitLayout() {
		
	}
	private void addEventListener() {
		
	}
}
