package com.dilip.dayTwoCodes;

public class SingletonClassDemoEarlyInit {

	private static SingletonClassDemoEarlyInit obj = new SingletonClassDemoEarlyInit();
	
	private SingletonClassDemoEarlyInit() {}
	public static SingletonClassDemoEarlyInit getInstance() {
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClassDemoEarlyInit obj = SingletonClassDemoEarlyInit.getInstance();
		SingletonClassDemoEarlyInit obj1 = SingletonClassDemoEarlyInit.getInstance();
		System.out.println(obj.equals(obj1));
		System.out.println(obj);
		System.out.println(obj1);
	}

}
