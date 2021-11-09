package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,3,6};
		int n= arr.length;
		Arrays.sort(arr);
		System.out.println("Sorted array is" );
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("array["+i+"]" +arr[i]);	
		}
		
		
		int sum = (n+1) * ( n + 2 ) / 2;
		
		for(int j=0;j<arr.length;j++)
		{
			sum=sum-arr[j];
		}
		
		System.out.println("missing is " +sum);
			
		
		
	}

}
