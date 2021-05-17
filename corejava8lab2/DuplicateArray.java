package corejava8lab2;

public class DuplicateArray {
	 int modifyArray(int arr[])
	 {
		 int j=0;
		 int n=arr.length;
		 int[] temp=new int[n];
		 for(int i=0;i<n;i++)
		 {
			if(arr[i]!=arr[i=1])
				temp[j++]=arr[i];
		 }
		 temp[j++]=a[n-1];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=temp[i];
		 }
		 retum temp;  
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
