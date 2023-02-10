package eX10;

public class Warrior extends Hero {
	public Warrior(String name, int hp) {
		// 부모클래스에 사용자 정의 생성자가 있다면 부모 생성자를 반드시 호출하여야 한다.
		super(name, hp); // super 키워드 : 부모 생성자 호출, 제일 먼저 쓰고 다음에 다른 코드를 쓸 수 있다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}

	void comboAttack() {
		System.out.println(name + "가 2단 공격을 합니다"); // this.name super.name 둘다 사용가능
	}

	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();

		// 메서드 오버로딩 -> 같은 메서드 이름을 사용할 수 있게 한다 (매개변수로 구분 가능)
		// System.out.println
	}
}
