package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.t.Palindrome;

public class TestPalindrome {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","racecar","liril"})
	public void testPalindrome(String str)
	{
		Palindrome p=new Palindrome();
		boolean b=p.isPalindrome(str);
		assertTrue(b);
	}

}
