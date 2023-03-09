package ch03;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		// DB 접근해서 기능 수행
		EmployeeDao employeeDao = new EmployeeDao();
		ArrayList<EmployeeDTO> list = employeeDao.select(10007);
		
		// SWING 화면이라면
		System.out.println("여기는 main");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
