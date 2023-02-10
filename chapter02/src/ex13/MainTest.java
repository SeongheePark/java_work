package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스를 사용해서 한명을 추출해주세요 ~
		String[] student = new String[18];
		student[0] = "이현서";
		student[1] = "김민우";
		student[2] = "김현우";
		student[3] = "전대영";
		student[4] = "이서영";
		student[5] = "이치승";
		student[6] = "정다운";
		student[7] = "이지운";
		student[8] = "박성희";
		student[9] = "김지현";
		student[10] = "김미정";
		student[11] = "김유주";
		student[12] = "손주이";
		student[13] = "한범진";
		student[14] = "강민정";
		student[15] = "배진석";
		student[16] = "김효린";
		student[17] = "편용림";

		Random random = new Random();
		int result = random.nextInt(student.length);
		System.out.println(student[result]);

		// 2
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 오름 차순으로 정렬 해주세요
		// for , if 문 활용
		for (int i = 0; i < myNumbers.length - 1; i++) {
			for (int j = 0; j < myNumbers.length - 1 - i; j++) {
				if (myNumbers[i] > myNumbers[i + 1]) {
					
				}
			}
			System.out.println(myNumbers[i]);
		}

	}

}
