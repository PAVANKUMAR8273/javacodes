package com.jspiders.libraries;

public class ObjectClassOverriding 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		System.out.println(d1.toString());
	}
}

class Demo
{
	public int hashCode()
	{
		return 10;
	}
	public String toString()
	{
		return "toString() overriden";
	}
}
