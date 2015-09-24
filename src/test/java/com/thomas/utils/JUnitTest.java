package com.thomas.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTest {
	@Test
	public void testHello() {
		System.out.println("This is testHello");
		assertEquals(2, 2);
	}
	
	public static void main(String[] args) {
		System.out.println("This is the main of JUnitTest");
	}
}