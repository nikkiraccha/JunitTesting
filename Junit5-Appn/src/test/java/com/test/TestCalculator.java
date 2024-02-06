package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Timeout;

import com.sathya.Calculator;

@DisplayName("my test class")
public class TestCalculator {
	
	static Calculator obj;
	
	@BeforeAll
	public static void init()
	{
		obj=new Calculator();
	}
	
	@AfterAll
	public static void destroy() {
		obj=null;
	}
	
	@Test
	@RepeatedTest(3)
	public void testAdd() {
		Calculator cal=new Calculator();
		Integer actual=cal.add(20, 10);
		Integer expected=30;
		assertEquals(actual, expected);
	}
	@Test
	@Timeout(10)
	public void testMul() {
		Calculator cal=new Calculator();
		Integer actual=cal.mul(20, 10);
		Integer expected=200;
		assertEquals(actual, expected);
	}
	
	
	@Nested
	public class SubTest
	{
		@Test
		@Tag("testing purpose")
		public void test() {
			
			Calculator cal=new Calculator();
			Integer actual=cal.mul(70, 0);
			Integer expected=0;
			assertEquals(actual, expected);
			
		}
		@TestFactory
	    Stream<DynamicTest> dynamicTests() {
	        return Stream.of(2)
	                .map(index -> DynamicTest.dynamicTest("Repeated Test #" + index, () -> {
	                    Calculator cal = new Calculator();
	                    Integer actual = cal.add(20, 10);
	                    Integer expected = 30;
	                    assertEquals(expected, actual);
	                }));
	    }

	}
	

}
