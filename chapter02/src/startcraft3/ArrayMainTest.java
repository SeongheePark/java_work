package startcraft3;

public class ArrayMainTest {

	public static void main(String[] args) {
		// 배열이란?
		// ! 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입 !
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이다.
		// [] 대괄호 이름 : 인덱스 연산자
		// 배열을 선언할 때 몇 칸의 공간을 사용할지 먼저 지정해야 한다!
		int[] arr = new int[5];
		// 네모칸 안에 값을 넣는 방법 (인덱스 연산 값 할당)
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		// 값 확인하는 방법
		System.out.println(arr[2]);
	}

}
