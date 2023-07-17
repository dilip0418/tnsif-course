package com.dilip.dayTwoCodes;

public class SingletonClassDemoLazyInit {
	
	private static SingletonClassDemoLazyInit obj;
	private SingletonClassDemoLazyInit() {}
	public static SingletonClassDemoLazyInit getInstance() {
		if(obj == null) 
			obj = new SingletonClassDemoLazyInit();
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClassDemoLazyInit obj = SingletonClassDemoLazyInit.getInstance();
		SingletonClassDemoLazyInit obj1 = SingletonClassDemoLazyInit.getInstance();
		System.out.println(obj.equals(obj1));
		System.out.println(obj);
		System.out.println(obj1);			
	}

}
