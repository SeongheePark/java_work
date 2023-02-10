package ch08;

// 디자인 패턴 - 싱글톤 패턴(Singleton Pattern)
// 객체 생성하는 코드의 사례
public class Company {
	// 1. 생성자를 private로 선언한다.
	private Company() {
	}

	// 2. 자기 자신의 데이터타입을 private+static로 선언한다.
	private static Company company;

	// 3. 외부에서 접근 가능한 메서드를 만들어둔다.
	public static Company getInstance() {
		// 4. 코드 구현하기
		if (company == null) {
			company = new Company();
		}
		return company;
	}

}
