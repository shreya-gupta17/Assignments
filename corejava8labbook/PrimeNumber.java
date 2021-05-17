package corejava8labbook;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the upper number::\n");
				int l=sc.nextInt();
				int i,c=0;
				String  primeNumbers = "";
				for(i=1;i<=l;i++)
						{
					int n;
					for(n =i; n>=1; n--)
			         {
				    if(i%n==0)
				    {
					c = c + 1;
				    }
				 }
				 if (c ==2){
					 primeNumbers = primeNumbers + i + " ";
				 }
						}
				System.out.println("Prime numbers from 1 to n are :");
			      System.out.println(primeNumbers);

	}

}
