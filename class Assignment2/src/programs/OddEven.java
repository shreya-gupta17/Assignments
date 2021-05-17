package programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of the array::\n");
		int i,even=0,odd=0;
		int l=sc.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter the lenght of the array::\n");
		for(i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<l;i++)
		{
			if(i%2==0)
				even=even+arr[i];
			else
				odd=odd+arr[i];
		}
		System.out.println("sum of even index::" +even);
		System.out.println("sum of odd index::\n"+odd);
	}

}
