package Factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class factTests {

	@Test
	public void test()
	{
		assertEquals(fact.factorial(0),1);
		assertEquals(fact.factorial(5),120);
	}
}
