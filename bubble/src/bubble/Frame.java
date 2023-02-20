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
		setTitle("bubble Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setContentPane(backgroundMap);
		setSize(1000,640);
	}
	private void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void addEventListener() {
		
	}
	public static void main(String[] args) {
		new Frame();
	}
}
