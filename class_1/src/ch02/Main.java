package ch02;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("해운대구 좌동 123", "부산", "롯데 103호", "456-123");
		Person person = new Person("홍길동", 10, address);
		System.out.println("name: " + person.getName());
		System.out.println(person.getAddress().toString());

		// Person클래스에서 Address클래스를 참조할 수 있다
		// Address클래스에서 Person클래스를 참조할 수 없다
	}

}
