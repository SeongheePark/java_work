package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student(1,"홍길동");
		Student student2 = new Student(2,"이순신");
		Student student3 = new Student(3,"홍길동");
		
		System.out.println(student1);
		System.out.println(student2);
		
		boolean result1 = student1.equals(student3);
		System.out.println(result1);

	}

}
