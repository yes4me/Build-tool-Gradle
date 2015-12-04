package org.gradle;

import org.junit.Assert;
import org.testng.annotations.Test;

public class JUnitTest {
	@Test(groups="junitTest", enabled = true)
	public void test1() {
		System.out.println("==> test1");
		Assert.assertTrue(true);
	}

	@Test(groups="junitTest", enabled = true)
	public void test2() {
		System.out.println("==> test2");
		Assert.assertTrue(true);
	}
}