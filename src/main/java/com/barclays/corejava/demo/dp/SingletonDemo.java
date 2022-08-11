package com.barclays.corejava.demo.dp;

public class SingletonDemo {

	public static void main(String[] args) {

//		Singleton obj = new Singleton();
//		Singleton obj2 = new Singleton();

		Singleton obj = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(obj3));
		System.out.println(obj2.equals(obj3));

	}

}
