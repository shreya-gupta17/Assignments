package programs;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length::");
		int c=0;
        int n = sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	arr[i]=sc.next().charAt(0);     
        System.out.println("Duplicate characters in given array:: ");    
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                   c++;
            }
        }
System.out.println(c);
	}

}
