package com.capgemini.lab9;

import java.util.Scanner;

public class EX3 {
	  public static void main(String[] args) {
			
		   User u = ()->{
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter username: ");
			   String userName = sc.next();
			   System.out.println("Enter password");
			   String passWord = sc.next();
			   if(userName.equals("Shreya") && passWord.equals("Password")) 
				   return true;
			   return false;
		   };
		   
		   if(u.checkUserName()) {
			   System.out.println("valid user name and password");
		   }else {
			   System.out.println("Invalid input");
		   }
	   }

}
