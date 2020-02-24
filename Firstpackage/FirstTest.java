package Firstpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

	@Test
	public void test() 
		{
			assertEquals(FirstProgram.area(10, 5),50);
			assertEquals(FirstProgram.area(5.8, 10.0),58.0,0.1);
			/* if you give the function an input that you do not have 
			* a function to handle it will return an error
			* assertEquals(FirstProgram.area("a", "b") "error"); */
			 
			
		}
	}


