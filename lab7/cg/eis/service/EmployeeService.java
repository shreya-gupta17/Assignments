package com.cg.eis.service;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import com.cg.eis.bean.Employee;
interface EmployeeServiceInterface{
	void getEmployeeDetails();
	void showEmployeeDetails();
}
public class EmployeeService extends Employee {
	
	Map<String, Employee> employeeList=new ConcurrentHashMap<String,Employee>();
	Employee employee=new Employee();
	Scanner sc=new Scanner(System.in);
	int eId;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	
	public EmployeeService(){
		
	}
	public void getEmployeeDetails() {
		System.out.println("Enter Employee Id:");
		eId=sc.nextInt();
		System.out.println("Enter Employee name:");
		name=sc.next();
		System.out.println("Enter Employee salary:");
		salary=sc.nextDouble();
		System.out.println("Enter Employee Designation:");
		sc.nextLine();
		designation=sc.nextLine();
	}
	public void addEmployee() {
		employee=new Employee(eId, name, salary, designation);
		
		employeeList.put(generateKey(employee), employee);
	}

	private String generateKey(Employee employee) {
		return String.format("%s-%s", employee.geteId(),employee.getName());
	}
	public void showEmployeedetails() {
		insuranceScheme=employee.insuranceScheme();
		System.out.println(employee.toString());
		System.out.println("Insurance Scheme : "+insuranceScheme);
	}
}
