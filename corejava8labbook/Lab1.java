package corejava8labbook;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::\n");
		int n=sc.nextInt();
		int c,d,s=0;
		while(n!=0)
		{
			d=n%10;
			c=d*d*d;
			s=s+c;
			n=n/10;
		}
		
		System.out.println("sum =  "+ s);

	}

}
