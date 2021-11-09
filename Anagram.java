package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String str1="abcd";
		String str2="dcba";
		System.out.println("string 1=" +str1+ "string 2=" +str2);
		
		if(str1.length() != str2.length())
		{
			System.out.println("not anagram");
			
		}
		
			
			char str1a[]=str1.toCharArray();
			char str2a[]=str2.toCharArray();
			
			Arrays.sort(str1a);
			Arrays.sort(str2a);
			System.out.println("The sorted array is ");
			System.out.println(str1a);
			System.out.println(str2a);
			
			for(int i=0;i<str1.length();i++)
			{
				if(str1a[i] != str2a[i])
				{
					System.out.println("The stings are not Anagram");
				}
				else
				{
					System.out.println("strings are anagram");
					break;
				}
			}
			
			
		
	}

}
