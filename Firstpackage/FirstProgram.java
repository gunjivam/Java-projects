package Firstpackage;

public class FirstProgram {
public static int area(int a, int b)
{
	return(a*b);
}
public static double area(double a, double b)
{
	return (a*b);
}
	public static void main(String[] args) {
		int length, width, res;
		double length2, width2, res2;
		length=10;
		width=15;
		length2=5.8;
		width2=10.0;
		res=area(length, width);
		res2=area(length2, width2);
		System.out.println("The area of rectangle1 is: " + res);
		System.out.println("The area of rectangle2 is: " +res2);
	
		
	
	}

}

