package com.spring.practice.pojos.singletone;

public class SingleTonePojo {
	private int pojoID;
	private String pojoName = "SingleTone Pojo";
	private static SingleTonePojo object = null;
	private SingleTonePojo(){
		
	}
	public static SingleTonePojo getInistance(){
		if(object == null){
			object = new SingleTonePojo();
		}
		return object;
	}
	public int getPojoID() {
		return pojoID;
	}
	public void setPojoID(int pojoID) {
		this.pojoID = pojoID;
	}
	public String getPojoName() {
		return pojoName;
	}
	public void setPojoName(String pojoName) {
		this.pojoName = pojoName;
	}

	
}
