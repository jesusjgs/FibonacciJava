package org.uma.pab2018.FibonacciRabbits;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	private Fibonacci fibonacci;
	
	@Before
	
	public void init() {
		fibonacci= new Fibonacci();
	}
	
	@Test 
	public void shouldFibRabOfNOneReturnOne() {
		int result = fibonacci.Compute(5,3,1,0);
		int expectedResult=19;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFibRabOfNFiveKThreeReturnNineteen() {

		int result = fibonacci.Compute(5,3,1,0);
		int expectedResult=19;
		
		assertEquals(expectedResult,result);
	}
	
}
