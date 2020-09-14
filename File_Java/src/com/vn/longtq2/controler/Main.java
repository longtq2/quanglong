package com.vn.longtq2.controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vn.longtq2.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		try {
			File f = new File("d:/EmPloyee.txt");
		    FileReader fr = new FileReader(f);
		    BufferedReader br = new BufferedReader(fr);
		    String line = null;
	    	System.out.println("SHOW ALL");
            System.out.println("----------------------------------------");
		    while ((line = br.readLine()) != null){
				String[] arr  = line.split(",");
	            Employee employee = new Employee();
	            if (arr.length > 0) {
					employee.setId(Integer.parseInt(arr[0]));
					employee.setName(arr[1]);
					employee.setAge(Integer.parseInt(arr[2]));
					employee.setSalary(Double.parseDouble(arr[3]));
					employee.setBD(convertStringToDate(arr[4]));
					
	                System.out.println("id: " + employee.getId());
	                System.out.println("Name: " + employee.getName());
	                System.out.println("Age: " + employee.getAge());
	                System.out.println("Salary: " + employee.getSalary());
	                System.out.println("BirthDay: " + convertDateToString(employee.getBD()));
	                System.out.println("----------------------------------------");	
				}
		    }

			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static Date convertStringToDate(String str) {
		try {
			return new SimpleDateFormat("yyyy/MM/dd").parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static String convertDateToString(Date date) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-dd-MM");
		return formatDate.format(date);
	}

}
