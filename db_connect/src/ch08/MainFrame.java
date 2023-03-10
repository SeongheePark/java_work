package ch08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements ActionListener {
	private JLabel map;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	UserDAO userDAO = new UserDAO();

	public MainFrame() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("저장");
		button2 = new JButton("수정");
		button3 = new JButton("조회");
		button4 = new JButton("삭제");
		button1.setSize(100, 50);
		button2.setSize(100, 50);
		button3.setSize(100, 50);
		button4.setSize(100, 50);
	}

	public void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == button1) {
//			userDAO.insert();
//		}
//		if (e.getSource() == button2) {
//			userDAO.update();
//		}
		if (e.getSource() == button3) {
			userDAO.select();
		}
//		if (e.getSource() == button4) {
//			userDAO.delete();
//		}

	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
