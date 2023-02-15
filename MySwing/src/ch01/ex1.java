package ch01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ex1 extends JFrame {
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField text1;
	private JTextField text2;

	public ex1() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("GUI");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("Save");
		button2 = new JButton("Reset");
		label1 = new JLabel("이름과 번호를 입력하세요.");
		label2 = new JLabel("Name");
		label3 = new JLabel("Number");
		text1 = new JTextField(10);
		text2 = new JTextField(10);
	}

	public void setInitLayout() {
		add(button1, BorderLayout.SOUTH);
		add(button2, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex1();
	}
}
