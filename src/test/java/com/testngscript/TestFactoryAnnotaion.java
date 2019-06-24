package com.testngscript;

import org.testng.annotations.Test;

public class TestFactoryAnnotaion {
	
	int param;
	public TestFactoryAnnotaion(int param){
		this.param=param;
		
	}
	@Test()
	public void f1(){
		System.out.println("inside f1" +param);
	}
	@Test
	public void f2(){
		System.out.println("f2"  +param);
	}
	@Test
	public void f3(){
		System.out.println("f3"   +param);
	}
	@Test
	public void f4(){
		System.out.println("f4"   +param);
	}
	@Test
	public void f5(){
		System.out.println("f5"   +param);
	}

}
