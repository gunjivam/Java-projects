package Factorial;
import java.util.Scanner;

# This code is calculating factorial using recursion

public class fact 
{
	public static int factorial(int a)
	{
		if(a==0)
		{return(1);
		}
		else
		{return(a*factorial(a-1));
		}
		}
	
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int n=reader.nextInt();
		System.out.println("The factorial of " + n + "is" + factorial(n));
	
		
	}
	}



