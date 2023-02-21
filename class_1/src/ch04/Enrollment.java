package ch04;

public class Enrollment {
	
	// 등록 기록
	// 홍길동 수학1 
	// 이순신 과학1
	// 티모  국어
	
	private int enrollentId;
	private Student student;
	private Course course;
	
	public Enrollment(int enrollentId, Student student, Course course) {
		this.enrollentId = enrollentId;
		this.student = student;
		this.course = course;
	}

	public int getEnrollentId() {
		return enrollentId;
	}

	public void setEnrollentId(int enrollentId) {
		this.enrollentId = enrollentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}
