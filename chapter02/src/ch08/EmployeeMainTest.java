package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee1.setName("홍길동");
		
		Employee employee3 = new Employee();
		employee1.setName("티모");
		
		//static 변수 사용할 때 - 각각 객체가 가지는 상태값을 저장해야 한다면 멤버변수 활용
		System.out.println(Employee.serialNum);
		
		//이순신 사원번호
		System.out.println(employee1.getEmployeeId());
		//홍길동 사원번호
		System.out.println(employee2.getEmployeeId());
		//티모 사원번호 
		System.out.println(employee3.getEmployeeId());
		
	}

}
