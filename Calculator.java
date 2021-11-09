package week1.day2;

public class Calculator {

	public void add(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("The addition of 3 numbers are =" +d);
	}
	
	public void sub(int e,int f)
	{
		int g= e-f;
		System.out.println("The substraction of 2 numbers is " +g);
	}
	
	public void mul(double m,double n)
	{
		double o= m*n;
		System.out.println("Multiiplication result=" +o);
	}
	
	public void div(float x, float y)
	{
		float z= x/y;
		System.out.println("the division result is=" +z);
	}
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(7, 6, 11);
		calc.sub(16, 5);
		calc.mul(12, 7);
		calc.div(22,7);

	}

}
