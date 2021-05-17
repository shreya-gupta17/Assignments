package corejava8labbook;

import java.util.Scanner;

public class Difference {
	int calculatedifference(int n)
	{
		int sum1=0,sum=0,sum2=0,i;
				for(i=1;i<=n;i++)
				{
					sum1=sum1+(i*i);
					sum2=sum2 +i;
					 sum=(sum2*sum2)-sum1;
				}
			
				return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A LIMIT::\n");
		
		int n=sc.nextInt();
		Difference obj=new Difference();
		System.out.println("Difference : "+ obj.calculatedifference(n));
		

	}

}
