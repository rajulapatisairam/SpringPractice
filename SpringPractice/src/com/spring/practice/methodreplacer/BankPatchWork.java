package com.spring.practice.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankPatchWork implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args)
			throws Throwable {
		int i = (Integer) args[0];
		System.out.println("\n Caluclating with  "+(i/10)+"");
		return null;
	}

	
}
