package programs;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sizes of two arrays: ");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int[] arr1 = new int[l1];
		int[] arr2 = new int[l2];
		
		for (int i = 0; i < l1; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < l2; i++)
			arr2[i] = sc.nextInt();
		int m[]=new int[l1+l2];
		int i = 0, k = 0, j = 0;
		while (i < arr1.length) {
			m[k] = arr1[i];
			i += 1;
			k += 1;
		}
		while (j < arr2.length) {
			m[k] += arr2[j];
			j += 1;
			k += 1;
		}
		for(i=0;i<k;i++){
		System.out.println(m[i]);
		}
	}

}
