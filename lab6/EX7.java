package com.capgemini.corejavalab6;


import java.util.Arrays;
import java.util.Scanner;

public class EX7 {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of size");
		n=sc.nextInt();
		System.out.println("enter the elements of the array");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("the sorted reverse array is");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
			
		}
		System.out.println();
		sc.close();
		
	}

}
