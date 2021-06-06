package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.service.EmployeeService;
public class EmployeeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		char ch='y';
		EmployeeService es=new EmployeeService();
		while(ch=='y') {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				es.getEmployeeDetails();
				es.addEmployee();
				System.out.println("Employee added ");
				break;
			case 2:
				es.showEmployeedetails();
				break;
			case 3:
				System.out.println("Thank You for using Employee Insurance Scheme");
				ch='n';
				System.exit(0);
				break;
				default:
					System.out.println("	Invalid choice");
			}
			System.out.println("Do you want to continue? (y/n)");
			ch=sc.next().trim().charAt(0);
			if(ch!='y')
				System.out.println("Thank You for using Employee Insurance Scheme");
		}
	}

}