package corejava8lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
		public int [] getSorted(int[] arr)
		{
			int n = arr.length;
			int num;
			for(int i=0;i<n;i++)
			{
				
				StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
				s.reverse();
				arr[i]= Integer.parseInt(String.valueOf(s));
				
			}
			Arrays.sort(arr);
			
			return arr;
			
			
			
		}

		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of the array ");
			
			n = sc.nextInt();
			int [] arr = new int[n];
			System.out.println("Enter the element of the array ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			
		ReverseArray ad = new ReverseArray();
			int [] result_array = new int[arr.length];
			result_array = ad.getSorted(arr);
			for(int i=0;i<result_array.length;i++)
			{
				System.out.println(result_array[i] + " ");
			}
			sc.close();


	}

}
