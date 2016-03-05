package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Inheritance.Cube;

public class CubeTest
{

	Cube cube;
	
	@Before
	public void setUp() throws Exception 
	{
		cube = new Cube(10);
	}

	@Test
	public void testCalculateVolume() 
	{
		assertEquals(600, cube.calculateVolume(),0);
	}

	@Test
	public void testCalculateArea() 
	{
		assertEquals(1000, cube.calculateArea(),0);
	}

}
