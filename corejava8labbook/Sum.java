package corejava8labbook;

import java.util.Scanner;

public class Sum {
	int calculateSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%3 ==0 || i%5 == 0)
			{
				sum=sum+i;
		}
		
	}
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit ");
		int n=sc.nextInt();
		Sum s=new Sum();
		System.out.println("The sum is "+ s.calculateSum(n));
		sc.close();
	}

}
