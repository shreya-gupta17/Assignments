package com.capgemini.lab9;

import java.util.Scanner;

public class EX1{
	
	 public static void main(String[] args) {
		
		 Power obj = ()->{
			 	Scanner s = new Scanner(System.in);
			 	System.out.println("Enter the values of X and Y:");
			 return (double) Math.pow(s.nextInt(), s.nextInt());
			};
			System.out.println("x power y is: "+obj.powerOfX());
	 	}
}