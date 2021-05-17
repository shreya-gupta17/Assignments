package programs;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length::");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();     
        System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])
                	c++;
             
            }
         
        }
        System.out.println(c);  
	}

}
