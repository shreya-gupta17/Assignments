package corejava8lab2;

import java.util.Scanner;

import corejava8labbook.Number;

public class Exercise1 {
	int getSecondSmallest(int arr[])
	{
		int i,j,t,n;
		n=arr.length;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER the size ::\n");
	    int 	n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Exercise1 obj=new Exercise1();
		obj.getSecondSmallest(a);
		System.out.println(" " +a[1]);

	}

}
