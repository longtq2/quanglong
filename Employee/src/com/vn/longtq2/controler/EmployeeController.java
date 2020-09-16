package com.vn.longtq2.controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.vn.longtq2.entities.Employee;

public class EmployeeController {

	public List<Employee> readDataCSV(File pathFileCsv) {
		try {
		    FileReader fr = new FileReader(pathFileCsv);
		    BufferedReader br = new BufferedReader(fr);
		    String line = null;
            List<Employee> empList = new ArrayList<Employee>();
		    while ((line = br.readLine()) != null){
				String[] arr  = line.split(",");
	            
	            if (arr.length > 0) {
	            	
	            	empList.add(new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3])));
	            }
		    }
		    return empList;
		} catch (Exception e) {
			System.out.println("Something when read file csv: " + e.getMessage());
			return null;
		}
		
	}
	
	public void showAllEmployees(List<Employee> empList) {
		for (Employee employee : empList) {
	    	System.out.println(employee.toString());
	    }
	}
	
	public List<Employee> sortByName(List<Employee> empList) {
		empList.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				String name1 = o1.getName();
				String name2 = o2.getName();
				if (name1.compareTo(name2) < 0)
					return -1;
				if (name1.compareTo(name2) > 0)
					return 1;
				return 0;
			}
		});
		return empList;
	}
	
	public List<Employee> sortBySalary(List<Employee> empList) {
		empList.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				Double salary1 = o1.getSalary();
				Double salary2 = o2.getSalary();
				if(salary1 < salary2){
					return 1;
				}else if(salary1 == salary2){
					return 0;
				}else{
					return -1;
				}
			}
		});
		return empList;
	}
	
	public List<Employee> sortBySalaryAge(List<Employee> empList) {
		 List<Employee> list = empList.stream()
 				.sorted(Comparator.comparing(Employee::getAge)
 						.thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
 				.collect(Collectors.toList());
		return list.subList(0, 3);
	}
	
	public List<Employee> employeeWithName(List<Employee> empList) {	
	
	    List<Employee> employeeWithName = empList
	    		  .stream()
	    		  .filter(c -> c.getName().contains("N"))
	    		  .collect(Collectors.toList());
		return employeeWithName;
		}
}
