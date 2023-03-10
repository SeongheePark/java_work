package ch06;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		ArrayList<EmployeeDTO> tempList = employeeDAO.showTitleEmpInfo("Cristinel","Bouloucos");
		for (int i = 0; i < tempList.size(); i++) {
			String empNo = tempList.get(i).getEmpNo();
			String firstName = tempList.get(i).getFirstName();
			String lastName = tempList.get(i).getLastName();
			String salary = tempList.get(i).getSalary();
			String count = tempList.get(i).getCount();
			System.out.println("empNo: " + empNo);
			System.out.println("firstName: " + firstName);
			System.out.println("title: " + lastName);
			System.out.println("salary: " + salary);
			System.out.println("count: " + count);
		}
	}

}
