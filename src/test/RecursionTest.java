package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import professional.Recursion;

public class RecursionTest
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void testSum()
	{
		assertEquals(55, Recursion.Sum(10));//Asserts that two longs are equal. If they are not, an AssertionError is thrown
	}

	@Test
	public void testPower() 
	{
		assertEquals(81, Recursion.Power(3, 4));
	}

}
