package ch06;

import java.util.ArrayList;

public interface IEmployeeDAO {
	// 풀 네임을 받아 직원의 연봉 받은 횟수를 반환하는 기능을 만들어주세요
	ArrayList<EmployeeDTO> showTitleEmpInfo(String firstName, String lastName);
	
	
	
}
