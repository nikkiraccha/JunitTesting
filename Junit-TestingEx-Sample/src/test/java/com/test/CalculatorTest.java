package com.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.t.Calculator;
import com.t.MathUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MathUtil.class)
public class CalculatorTest {
	@Test
	public void testAddwithMathUtil() {
		PowerMockito.mockStatic(MathUtil.class);
		when(MathUtil.add(4, 3)).thenReturn(7);
		
		Calculator calculator=new Calculator();
		int result=calculator.addwithMathUtil(4, 3);
		
		assertEquals(7, result);
		PowerMockito.verifyStatic(MathUtil.class);
		MathUtil.add(4, 3);
	}

}
