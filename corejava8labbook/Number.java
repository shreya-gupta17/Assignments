package corejava8labbook;

import java.util.Scanner;

public class Number {
	boolean checkNumber(int n){
		int i;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A LIMIT::\n");
		
		int n=sc.nextInt();
		Number obj=new Number();
		System.out.println("power of 2 : "+ obj.checkNumber(n));
		

	}

}
