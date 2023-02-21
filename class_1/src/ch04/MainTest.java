package ch04;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob.example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathematics");
		Course course2 = new Course(2, "English", "introduction to English");

		// 1번 학생이 1번 과정 등록
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);

		// 학생의 데이터에 내가 등록한 정보를 저장할 수 있다
//		ArrayList<Enrollment> list = new ArrayList<>();
//		list.add(enrollment1); 
//		student1.setEnrollment(enrollment1);

		student1.addEnrollment(enrollment1);
		student1.addEnrollment(enrollment3);
		student2.addEnrollment(enrollment2);

		// 학생이 신청한 과정의 이름을 화면에 출력하세요
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());

		// 학생1이 신청한 과정의 이름을 화면에 출력하세요 (반복문 사용)
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(courseName);
		}
		// 위 코드는 학생과 과목을 Enrollment class를 통해서 연결하는 예제 코드이다.

		// Enrollment 학생 정보와 과목 정보를 반복문을 통해서 출력해주세요
		System.out.println("학생이름: " + enrollment1.getStudent().getName());
		System.out.println("수강과목: " + enrollment1.getCourse().getName());
		
		// ArrayList를 생성해서 Enrollment 저장해주세요
		ArrayList<Enrollment> list = new ArrayList<>();
		
		list.add(enrollment1);
		list.add(enrollment2);
		list.add(enrollment3);
		
		for (Enrollment e : list) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
		}
		
		// foreach Alice에 수강하고 있는 과명 이름을 다시 한번 더 출력하시오 (Student1 접근)
		for (Enrollment enrollment : student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());
		}
		
	}

}
