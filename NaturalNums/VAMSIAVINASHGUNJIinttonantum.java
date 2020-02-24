package NaturalNums;

import java.util.Scanner;

public class VAMSIAVINASHGUNJIinttonantum {
	public static GUNJI_VAMSIAVINASH_interface inttonatnum (int a) {
		if (a==0)
			return (new VAMSIAVINASHGUNJIZero());
		else 
		{return (inttonatnum(a-1).succ());
	}
		
}

public static void main(String[] args)
{

	Scanner reader=new Scanner(System.in);
	System.out.print("Enter a natural number: ");
	int n=reader.nextInt();
	GUNJI_VAMSIAVINASH_interface b;
	b=inttonatnum(n);
	System.out.println();
	try {
		b.Factorial().print();
	} catch (Exception e) {
		//
		e.printStackTrace();
	}
	reader.close();

}}