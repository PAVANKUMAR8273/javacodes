class A
{
	public A()
	{
		System.out.println("without parameters");
    }
	public A(int a,int b)
	{
		System.out.println("with 2 parameters");
	}
	public A(int a)
	{
		System.out.println("with 1 parameter");
	}
}
class B extends A
{
    super();
	public B()
	{
		System.out.println("abv");
	}
	public B(int a,int b)
	{
		System.out.println("with 2 parameters");
	}
	public B(int a){
		System.out.println("with 1 parameter");
	}	
}
class Sub
{
	public static void main(String[] args) 
	{
		B b1=new B(2);
	}
}
