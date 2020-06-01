package lab4;

/*
 * Vamsi Avinash Gunji
 * Dr.Puya
 * Intro to Object Oriented Design 1
 * 
 */

import java.util.Scanner;
/* 
*/
import java.util.Stack;

public class Evaluate
{
	public static int evaluate(String exprsn)
	{	//String clean=exprsn.replaceAll(""," ");
		char[] tkn = exprsn.toCharArray();

		// Stack for numbers: 'values'
		Stack<Integer> values = new Stack<Integer>();

		// Stack for Operators: 'ops'
		Stack<Character> ops = new Stack<Character>();

		for (int i = 0; i < tkn.length; i++)
		{
			// Current token is a whitespace, skip it
			if (tkn[i] == ' ')
				continue;

			// Current token is a number, push it to stack for numbers
			if (tkn[i] >= '0' && tkn[i] <= '9')
			{
				StringBuffer sbuf = new StringBuffer();
				// There may be more than one digits in number
				while (i < tkn.length && tkn[i] >= '0' && tkn[i] <= '9')
					sbuf.append(tkn[i++]);
				values.push(Integer.parseInt(sbuf.toString())); //Write a while loop to push a token into Stack.
			}

			// Current token is an opening brace, push it to 'ops'
			else if (tkn[i] == '(')
				ops.push(tkn[i]); //If open paranthesis, push it to Ops

			// Closing brace encountered, solve entire brace
			else if (tkn[i] == ')')
			{
				while (ops.peek() != '(')
				values.push(apply(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			} // If closed, call and solve the entire Paranthesis.

			// Current token is an operator.
			else if (tkn[i] == '+' || tkn[i] == '-' ||
					tkn[i] == '*' || tkn[i] == '/')
			{
				// While top of 'ops' has same or greater precedence to current
				// token, which is an operator. Apply operator on top of 'ops'
				// to top two elements in values stack
				while (!ops.empty() && hasPrecedence(tkn[i], ops.peek()))
				values.push(apply(ops.pop(), values.pop(), values.pop()));

				// Push current token to 'ops'.
				ops.push(tkn[i]);
			}
		}

		// Entire expression has been parsed at this point, apply remaining
		// ops to remaining values
		while (!ops.empty())
			values.push(apply(ops.pop(), values.pop(), values.pop()));

		// Top of 'values' contains result, return it
		return values.pop();
	}

	// Returns true if 'op2' has higher or same precedence as 'op1',
	// otherwise returns false.
	public static boolean hasPrecedence(char operator1, char operator2)
	{
		if (operator2 == '(' || operator2 == ')')
			return false;
		if ((operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-'))
			return false;
		else
			return true;
	}

	// A utility method to apply an operator 'op' on operands 'a' 
	// and 'b'. Return the result.
	public static int apply(char operator, int b, int a)
	{
		switch (operator)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}

	// Driver method to test above methods
	public static void main(String[] args)
	{
		
			System.out.println("Enter your Equation: ");
			Scanner scanner = new Scanner(System.in);
			String avi = scanner.nextLine();
			
			System.out.println("Your Result is " + evaluate(avi));
			
			
			
		
	//	System.out.println(Evaluate.evaluate("3 * ( 4 + 5 )"));
	//	System.out.println(Evaluate.evaluate("10 + 1 * 6"));
		//System.out.println(Evaluate.evaluate("100 * 2 + 12"));
		//System.out.println(Evaluate.evaluate("100 * ( 2 + 12 )"));
		//System.out.println(Evaluate.evaluate("100 * ( 2 + 12 ) / 14"));
	}
}

