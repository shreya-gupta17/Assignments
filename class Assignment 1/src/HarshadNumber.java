import java.util.Scanner;
public class HarshadNumber {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a number : ");
		int n = sc.nextInt();
		int x = n, y, sum = 0;

		while(x>0)
		{
			y = x%10;
			sum = sum + y;
			x = x/10;
		}

		if(n%sum == 0)
			System.out.println("Harshad Number.");
		else
			System.out.println("Not a Harshad Number.");      
	}
}