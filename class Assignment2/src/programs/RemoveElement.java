package programs;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of the array::\n");
		int i;
		int l=sc.nextInt();
		int arr[]=new int[l];
		for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the index of the element to be deleted");
		int r=sc.nextInt();
		for(i=r;i<l-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println("Array after the removing the element is ");
		for(i=0;i<l-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	
	}

}
