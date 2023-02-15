package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RainbowColor extends JFrame implements ActionListener {
	private JPanel panel;
	private JPanel panel2;
	JButton[] buttons = new JButton[7];

	public RainbowColor() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setSize(500, 500);
		panel2 = new JPanel();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1));
		}
	}

	private void setInitLayout() {
		add(panel);
		panel.setBackground(Color.black);
		add(panel2, BorderLayout.SOUTH);
		for (int i = 0; i < buttons.length; i++) {
			panel2.add(buttons[i]);
		}
		setVisible(true);
	}

	private void addEventListener() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}

	public static void main(String[] args) {
		new RainbowColor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.buttons[0]) {
			panel.setBackground(Color.red);
		} else if (e.getSource() == this.buttons[1]) {
			panel.setBackground(Color.orange);
		} else if (e.getSource() == this.buttons[2]) {
			panel.setBackground(Color.yellow);
		} else if (e.getSource() == this.buttons[3]) {
			panel.setBackground(Color.green);
		} else if (e.getSource() == this.buttons[4]) {
			panel.setBackground(Color.blue);
		} else if (e.getSource() == this.buttons[5]) {
			panel.setBackground(Color.gray);
		} else if (e.getSource() == this.buttons[6]) {
			panel.setBackground(Color.cyan);
		}

	}
}
