package ch08;

public class StringMethod {
	public static void main(String[] args) {
		// 1. concat()
		// 문자열과 문자열을 결합하는 메서드
		String str1 = "안녕?";
		String str2 = "반가워!";
		System.out.println(str1.concat(str2));
		// 출력결과 : 안녕?반가워!

		// 2. replace()
		// 문자열의 일부를 다른 문자열로 바꿔주는 메서드
		String str3 = "안녕? 반가워!";
		String newstr3 = str3.replace("안녕", "안녕하세요?");
		System.out.println(newstr3);
		// 출력결과 : 안녕하세요?? 반가워!

		// 3. length()
		// 문자열 데이터의 길이를 반환하는 메서드
		String str4 = "안녕?반가워!";
		System.out.println(str4.length());
		// 출력결과 : 7

		// 4. indexOf()
		// 문자가 위치한 인덱스를 반환하는 메서드 (0부터 시작)
		// 2개 이상 발견 -> 가장 먼저 오는 인덱스 반환
		// 존재하지 않는 경우 -> -1 반환
		String str5 = "안녕? 반가워!";
		System.out.println(str5.indexOf('반'));
		// 출력결과 : 4

	}
}
