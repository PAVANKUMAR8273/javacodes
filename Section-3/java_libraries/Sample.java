package com.jspiders.libraries;

public class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("program starts..");
			
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		int h1 = obj1.hashCode();
		System.out.println("object 1 hascode : "+h1);
		
		String s1 = obj1.toString();
		System.out.println("String Value of object1 :"+s1);
		
		boolean b1 = obj1.equals(obj3);
		System.out.println("obj1 equals obj3 :"+b1);
		
		int h2 = obj2.hashCode();
		System.out.println("obj2 hashcode : "+h2);
		System.out.println("program ends..");

	}

}
