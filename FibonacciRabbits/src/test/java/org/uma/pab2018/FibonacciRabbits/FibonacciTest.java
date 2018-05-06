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
		int result = fibonacci.Compute(1,1,1,0);
		int expectedResult=1;
		
		assertEquals(expectedResult,result);
	}
	
	@Test (expected= RuntimeException.class)
	public void shouldNValueLess41() {
		fibonacci.Compute(41,1,1,0);
	}
	@Test (expected= RuntimeException.class)
	public void shouldNValuePossitive() {
		fibonacci.Compute(-1,1,1,0);
	}
	@Test (expected= RuntimeException.class)
	public void shouldKValueLess6() {
		fibonacci.Compute(2,6,1,0);
	}
	@Test (expected= RuntimeException.class)
	public void shouldKValuePositive() {
		fibonacci.Compute(2,-1,1,0);
	}
	
	
	@Test
	public void shouldFibRabOfNFiveKThreeReturnNineteen() {

		int result = fibonacci.Compute(5,3,1,0);
		int expectedResult=19;
		
		assertEquals(expectedResult,result);
	}
	
}
