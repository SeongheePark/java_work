package ch07;

class Person {
	// this의 3가지 사용법
	// 1. 자기 자신을 가리킨다.
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 생성자는 객체가 메모리에 올라갈 때 제일 먼저 실행하는 코드이다.
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
	public Person(String name, int age, String phone) {
		this(name, age); // <-- 위 생성자 호출
		this.phone = phone;
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	// 3. 자신의 주소(참조값, 주소값)를 반환시킬 수 있다.
	// 자신을 반환하는 this는 빌더패턴(디자인패턴)을 만들어낼 수 있다.
	public Person getPerson() {
		return this;
	}

	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age);
	}
} // end of Person class

// xx.java 하나의 파일 안에 여러개의 클래스를 작성할 수 있다.
// 단, java 하나의 파일 안에 public을 가지는 클래스는 단 하나만 선언할 수 있다.
// 자동으로 접근 제어 지시자 default --> ch07에 있는 클래스 사용 가능
class PersonMainTest {
	// static main함수는 잠시 자리를 빌려서 사용한다.
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 100);
		person1.showInfo();
	}
}// end of PersonMainTest class
