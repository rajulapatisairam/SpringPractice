package com.spring.practice.pojos;

public class Pojo {
	
	private String name;
	private int age;
	private String email;
	
	
	
	
	private Pojo(int age) {
		super();
		this.age = age;
	}

	private Pojo(String name) {
		super();
		this.name = name;
	}

	private Pojo(String name, int age,String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public void callName(){
		 System.out.println(" Name is; "+name+" age is : "+age+" Email is: "+email);
	 }

}
