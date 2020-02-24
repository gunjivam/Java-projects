package NaturalNums;

import static org.junit.Assert.*;

import org.junit.Test;

public class VAMSIAVINASHGUNJITests {

	@Test
	public void test() {
		GUNJI_VAMSIAVINASH_interface zero = new VAMSIAVINASHGUNJIZero();  
		GUNJI_VAMSIAVINASH_interface two = zero.succ().succ();
		GUNJI_VAMSIAVINASH_interface one= zero.succ();
		
		assertEquals(zero.getVal(), 0);
		assertEquals(two.getVal(), 2);
		assertEquals(zero.isZero(), true);
		assertEquals(two.isZero(), false);
		
		assertEquals(two.equal(zero), false);
		try        // Anything that can throw an exception needs try-catch
		{ assertEquals(two.pred().getVal(), 1); }
		catch(Exception e)
		{System.out.println("Error: " + e.getMessage()); } 
		assertEquals(zero.lessthan(two),true);
		assertEquals(two.greaterthan(zero),true);
		assertEquals(two.lessthaneq(two),true);
		assertEquals(two.greaterthaneq(zero),true);
		try {
			assertEquals(two.sub(zero).getVal(),2);
		} catch (Exception e) {
			{System.out.println("Error: " + e.getMessage()); }
		}
		try {
			assertEquals(two.sub(one).getVal(),1);
		} catch (Exception e) {
			{System.out.println("Error: " + e.getMessage()); }
		}
		//try {
		//	assertEquals(zero.sub(two).getVal(),9);
		//} catch (Exception e) {
		//	{System.out.println("Error: " + e.getMessage()); }
		//}
		try {
			assertEquals(two.multiplication(one).getVal(),2);
		} catch (Exception e) {
			{System.out.println("Error: " + e.getMessage()); }
		}
		try {
			assertEquals(two.quotient(one).getVal(),2);
		} catch (Exception e) {
			{System.out.println("Error: " + e.getMessage()); }
			try {
				assertEquals(two.remainder(one).getVal(),0);
			} catch (Exception k) {
				{System.out.println("Error: " + k.getMessage()); }
			}}
			//assertEquals(print(5),5);
		
	

	try {
		assertEquals(one.Factorial().getVal(),1);
	} catch (Exception k) {
		{System.out.println("Error: " + k.getMessage()); }
	}}
	}	
		




		
	//	
		
		

