package week1.day2;

public class ToUpper {

	public static void main(String[] args) {
		
		String str="welcome";
		int leng = str.length();
		
		char[] charstr = str.toCharArray();
		
		for(int i=0;i<leng;i++)
		{
			System.out.println("The charecter array is Str["+i+"]" + charstr[i]);
		}

		for(int i=0;i<leng;i++)
		{
		if( i % 2!=0)
		{
		char ucase =Character.toUpperCase(charstr[i]);
		System.out.println(ucase);
		}
		else
			System.out.println(charstr[i]);
		}

	}

}
