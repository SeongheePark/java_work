package ex01;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤번호 발생하는 클래스 1~45
// 6개 번호를 리턴하는 기능, 정렬
public class LottoRandomNumber {
	final int LOTTO_NUMBER_SIZE = 6;
	
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			// 중복 검증
			// i = 0
			for (int j = 0; j < i; j++) {
				if(lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum);
		return lottoWinNum;
	}
}
