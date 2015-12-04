package org.gradle;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGTest{
	@BeforeGroups("group1")
	public void beforeGroups() {
		System.out.println("TestGroup1 > @beforeGroups('group1')");
	}
	@AfterGroups("group1")
	public void afterGroups() {
		System.out.println("TestGroup1 > @afterGroups('group1')");
		Assert.assertTrue(true);
	}


	@Test(groups= "group1")
	public void test11() {
		System.out.println("TestGroup1 > group1.1");
		Assert.assertEquals(2, 2);
	}
	@Test(groups= "group1")
	public void test12() {
		System.out.println("TestGroup1 > group1.2");
	}

	@Test(groups= "group2")
	public void test21() {
		System.out.println("TestGroup1 > group2.1");
	}
	@Test(groups= "group2")
	public void test22() {
		System.out.println("TestGroup1 > group2.2");
	}

	@Test(dependsOnGroups = {"group1","group2"})
	public void runFinal() {
		System.out.println("TestGroup1 > group1 & group2");

	}

	public static void main(String[] args) {
		System.out.println("This is the main of TestNGTest");
	}
}