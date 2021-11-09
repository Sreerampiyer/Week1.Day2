package week1.day2;

import java.util.Arrays;

public class ArrayLength {

	public static void main(String[] args) {

		int array[]= {45,54,78,23,11,30};
		
		int lengtharray = array.length;
		System.out.println("Array Before Sorting");
		for(int i = 0;i < lengtharray; i++)
		{
		System.out.println("Array["+i+"]" +array[i]);	
		}
		
		Arrays.sort(array);
		System.out.println("The sorted array is");
		for(int i = 0;i < lengtharray; i++)
		{
		System.out.println("Array["+i+"]" +array[i]);	
		}
		
		System.out.println("The largest element=" +array[lengtharray-1]);
		System.out.println("The Second largest element=" +array[lengtharray-2]);
		System.out.println("The Smallest element=" +array[0]);
		System.out.println("The Second Smallest element=" +array[1]);

	}

}
