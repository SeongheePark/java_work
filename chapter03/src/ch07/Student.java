package ch07;

public class Student {
	// 학번과 이름을 정의
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// toString, equals 메서드를 재정의해주세요
	@Override
	public String toString() {
		return "[" + id + "," + name + "]";
	}

	// 이름이 같다면 동명이인입니다 출력
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.name == student.name) {
				System.out.println("동명이인입니다!");
				return true;
			}
		}
		return false;
	}
}
