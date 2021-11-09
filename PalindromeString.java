package week1.day2;

import java.lang.reflect.Array;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		String nw="";
		
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			nw=temp+nw;		
		}
		System.out.println("The reversed string ==" +nw);
		
		if(str.equalsIgnoreCase(nw))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}

}
