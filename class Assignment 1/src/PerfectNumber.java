import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER ::\n");
		
		int n=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");

	}

}
