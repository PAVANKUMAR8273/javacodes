class Sample
{
	public void view()
	{
		System.out.println("view() of Sample");
	}
}
class Demo extends Sample
{
	public void view()
	{
		System.out.println("overriding view()");
	}	
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Demo ref1	= new Demo();
		Sample ref2=ref1;                      
		ref2.view();                      // Golden Java rule here we will get the implementation of Subclass view() becz due to
	}									  // run time polymorphism JVM will change the implementation super class view() to subclass 
}										  // view() method so we get the implementation of subclass view().	