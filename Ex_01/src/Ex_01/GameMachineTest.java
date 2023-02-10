package Ex_01;

import java.util.Random;
import java.util.Scanner;

public class GameMachineTest {
	String name;
	int price;

	public void getMoney() {
		System.out.println("돈을 받았습니다!");
	}

	public void takeGift() {
		System.out.println("상품이 나옵니다!");
	}

	public void showInfo() {
		System.out.println("상품명: " + this.name);
		System.out.println("금액: " + this.price);
	}

	static int randomNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(6) + 1;
		return resultNumber;
	}

	public static void main(String[] args) {
		GameMachineTest candy = new Candy("사탕",1_000);
		GameMachineTest teddybear = new Teddybear();
		GameMachineTest money = new Money();
		GameMachineTest lego = new Lego();
		GameMachineTest toycar = new Toycar();

		GameMachineTest[] toy = new GameMachineTest[6];
		toy[0] = candy;
		toy[1] = teddybear;
		toy[2] = money;
		toy[3] = lego;
		toy[4] = toycar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("**뽑기 시작**");
		System.out.println("1~6 중 원하는 번호를 골라주세요");
		int choiceNum = scanner.nextInt();
		int randomNum = randomNumber();
		System.out.println(randomNum);
		for (int i = 0; i < toy.length; i++) {
			if (toy[i] == null) {
				System.out.println("꽝입니다..!");
				break;
			} else {
				if (choiceNum == randomNum) {
					if (choiceNum == 1) {
						System.out.println("사탕 당첨");
						toy[0].showInfo();
						break;
					} else if (choiceNum == 2) {
						System.out.println("곰인형 당첨");
						teddybear.showInfo();
						break;
					} else if (choiceNum == 3) {
						System.out.println("축하합니다! 현금에 당첨되었어요!");
						money.showInfo();
						break;
					} else if (choiceNum == 4) {
						System.out.println("레고 당첨");
						lego.showInfo();
						break;
					} else if (choiceNum == 5) {
						System.out.println("장난감 자동차 당첨");
						toycar.showInfo();
						break;
					}
				}
			}
		}

	}
}
