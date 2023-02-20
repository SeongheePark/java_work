package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤번호 발생하는 클래스 1~45
// 6개 번호를 리턴하는 기능, 정렬
public class LottoRandomNumber {
	public int[] getNumbers() {
		Random random = new Random();
		int[] lottoNum = new int[6];
		for (int i = 0; i < lottoNum.length; i++) {
			int randomNum = random.nextInt(45) + 1;
			lottoNum[i] = randomNum;
			for (int e = 0; e < i; e++) {
				if (lottoNum[i] == lottoNum[e]) {
					i = i - 1;
					break;
				}
			}
		}
		Arrays.sort(lottoNum);
		return lottoNum;
	}
	public static void main(String[] args) {
		LottoRandomNumber lottoRandomNumber = new LottoRandomNumber();
		int[] resultNumber = lottoRandomNumber.getNumbers();
		for (int i = 0; i < resultNumber.length; i++) {
			System.out.println(resultNumber[i]);
			
		}
	
	}
}
