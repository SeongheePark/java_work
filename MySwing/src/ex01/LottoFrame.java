package ex01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 화면 담당
// LottoRandomNumber 클래스에서 받아서 처리하기
public class LottoFrame extends JFrame {
	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto Game");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
		lottoRandomNumber = new LottoRandomNumber();
		
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 200));
		add(button);
		setVisible(true);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게임 시작합니다!");

				repaint();
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("강원교육모두 가늘게", Font.BOLD, 40);
		g.setFont(font);
		if (isStart == false) {
			g.drawString("게임을 시작해보세요 !", 100, 200);
			isStart = true;
			return;
		}
		// 6개 정렬된 난수 값을 받음!
		// 실행의 흐르을 사용하는 변수를 쓰면 값 초기화를 잘 확인하자
		int[] getNumbers = lottoRandomNumber.createNumber();
		g.drawString(getNumbers[0] + "", 50, 350);
		g.drawString(getNumbers[1] + "", 150, 350);
		g.drawString(getNumbers[2] + "", 250, 350);
		g.drawString(getNumbers[3] + "", 350, 350);
		g.drawString(getNumbers[4] + "", 450, 350);
		g.drawString(getNumbers[5] + "", 530, 350);
	}

}
