package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.t.EvenOrOdd;

public class EvenOddTest {
	
	@ParameterizedTest
	@ValueSource(ints= {4,6,6124,8,4,2})
	public void testEvenOrOdd(int n)
	{
		EvenOrOdd obj=new EvenOrOdd();
		boolean a=obj.evenorodd(n);
		assertTrue(a);
	}

}
