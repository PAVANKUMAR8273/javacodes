class Inheritance  //singleinheritance    
					  //ain motive to use inheritance is to avoid duplicate methods
{					  // to create inheritance relation we use keyword "extends". see line : 23
	public static void main(String[] args) 
	{	
	 C ref = new C();

	 System.out.println("K : "+ref.i);  // here we are accessing the properties of sub class : K
	 ref.test2();						// and test2() of child class using child class object

	 System.out.println("j : "+ref.j);  // here we are accessing the propertie of a child class  : j
	 ref.test1();						// and test1() of child class using child class object

	 System.out.println("i : "+ref.i);  // here we are accessing the properties of parent class : i
	 ref.test();						// and test() of parent class using child class object 
	}
}

class A                  // here A acts as a Parent class
{
	int i=10;            // members within this body are properties of parent class A
	public void test()
	{
		System.out.println("this is a test() of A");
	}
}

class B extends A      // here b acts as a child class, who inherit the properties of A
{
	int j=20;          // members within this body are properties of child class B
	public void test1()
	{
		System.out.println("this is a test1() of B");
	}
}

class C extends B
{
	int k=30;
	public void test2()
	{
		System.out.println("this is a test2() of C");
	}
}