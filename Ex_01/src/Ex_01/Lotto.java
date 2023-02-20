package Ex_01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public int[] getNumbers() {
		int[] lottoGame = new int[6];
		Random random = new Random();
		for (int i = 0; i < lottoGame.length; i++) {
			lottoGame[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoGame[i] == lottoGame[j]) {
					i = i - 1;
					break;
				}
			}
		}
		Arrays.sort(lottoGame);
		return lottoGame;
	}

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] result = lotto.getNumbers();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
