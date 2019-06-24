package com.testngscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {
	
	@BeforeSuite
	public void beforeSuit(){
		System.out.println(" I am before Suite");
	}
	@AfterSuite
	public void afterSuit(){
		System.out.println("I m after suite");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("i m b4 method");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("i m after method");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("I am before test");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("I m b4 class");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("I m after class");
	}
	
	@Test
	public void testYou(){
		System.out.println("I m test2");
	}
	@Test
	public void testPk(){
		System.out.println("Hi 2nd in Test two");
	}
	@Test
	public void testCk(){
		System.out.println("Hi 3rd test two");
	}

}
