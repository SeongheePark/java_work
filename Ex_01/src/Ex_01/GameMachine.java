package Ex_01;

import java.util.Random;
import java.util.Scanner;

public class GameMachine {
	String name;
	int price;

	public void getMoney() {
		System.out.println("돈을 받았습니다!");
	}

	public void takeGift() {
		System.out.println("상품이 나옵니다!");
	}

	static int randomNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(10) + 1;
		return resultNumber;
	}

	public static void main(String[] args) {
	}}
