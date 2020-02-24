package Fibcode;

public class Fibonacci {
	public static int fib(int N)
	//Purpose: To compute the nth Fibonacci number
	{
		if (N==0)
		{
			return(0);
		}
		else if(N==1)
		{
			return(1);
		}
		else
		{
			int n = N;//Purpose: To index the last fib # computed as: N-n+1
			int res = 1;// Purpose: The last fib # computed
			int f1 = 0;//Purpose: The next to last fib # computed
			//INV: res== fin(N-n+1) && f1 == fib(N-n)
			while (n != 1)
			{
				//: res== fin(N-n+1) && f1 == fib(N-n) && n!=1
				int temp=f1;
				//: res== fin(N-n+1) && f1 == fib(N-n) && n!=1 && temp == fib (N-n)
				f1=res;
				//res== fin(N-n+1) && f1 == fib(N-n) && n!=1 && temp == fib (N-n)
				res= res+ temp;
				//res== fin(N-n+2) && f1 == fib(N-n) && n!=1
				n= n-1;
				//res== fin(N-n+1) && f1 == fib(N-n) 			
			}
			//INV: res== fin(N-n+1) && f1 == fib(N-n) && n<=1
			//==> res==
			{return res;}
			
		}
	}

}
