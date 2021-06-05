package com.capgemini.corejavalab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX3 {
	public void getSquares(int[] arr)
	{
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			hmap.put(i, i*i);
		}
		for(Map.Entry<Integer, Integer> e : hmap.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		EX3 obj=new EX3();
		obj.getSquares(arr);

	}

}
