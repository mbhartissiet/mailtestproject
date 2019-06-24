package com.testngscript;

import org.testng.annotations.Factory;

public class FactoryCalsses {
	
	@Factory
	public Object[] invokeObject(){
		Object[] data = new Object[5];
		data[0] = new TestFactoryAnnotaion(4);
		data[1] = new TestFactoryAnnotaion(5);
		data[2] = new TestFactoryAnnotaion(6);
		data[3] = new TestFactoryAnnotaion(7);
		data[4] = new TestFactoryAnnotaion(8);
		return data;
	}

}
