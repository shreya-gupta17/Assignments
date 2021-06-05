package com.capgemini.corejavalab6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the Array");
	n=sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i: arr)
	{
		list.add(i);
	}
	Collections.sort(list);
	System.out.println("array after sorting");
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	System.out.println("The second smallest number in the array"+list.get(1));
	
	}

}
