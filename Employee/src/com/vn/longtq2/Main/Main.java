package com.vn.longtq2.Main;
import java.io.File;
import java.util.List;

import com.vn.longtq2.controler.EmployeeController;
import com.vn.longtq2.entities.Employee;

public class Main {
	public static void main(String[] args) {
		EmployeeController  controller = new EmployeeController();
		File pathFileCsv = new File("d:/EmPloyee.txt");
	
		// 1. Tạo ra 1 list danh sách nhân viên tùy ý
		System.out.println("\n========1. list danh sách nhân viên=========");
		List<Employee> empList = controller.readDataCSV(pathFileCsv);
		controller.showAllEmployees(empList);
		// 2. Sắp xếp theo thứ tự của name trong employee

		System.out.println("\n========2. thứ tự của name========");
		List<Employee> empListSortByName = controller.sortByName(empList);
		controller.showAllEmployees(empListSortByName);
		
		//3.	Sắp xếp theo mức lương tư cao tới thấp
		System.out.println("\n========3. mức lương tư cao tới thấp========");
		List<Employee> empListSortBySalary = controller.sortBySalary(empList);
		controller.showAllEmployees(empListSortBySalary);
		
		//4.	Lọc ra 3  người trẻ nhất vào có mức lương cao nhất
		System.out.println("\n========4. 3 người trẻ nhất vào có mức lương cao nhất========");
		List<Employee> empListSortBySalaryAge = controller.sortBySalaryAge(empList);
		controller.showAllEmployees(empListSortBySalaryAge);
		
		//5.	Tìm ra các Employee có tên chứa kí tự N
		System.out.println("\n========4. tên chứa kí tự N========");
		List<Employee> employeeWithName = controller.employeeWithName(empListSortByName);
		controller.showAllEmployees(employeeWithName);
	}
}
