class Sample
{
	int v=25;
	public void view()
	{
		System.out.println("view() of Sample class");
	}
}
class Demo extends Sample
{
	int z=50;
	public void display()
	{
		System.out.println("display() of Demo class");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Demo ref1=new Demo();
		Sample ref2=ref1;      //upcasting
		System.out.println(ref2.v);
		ref2.view();

		Demo ref3=(Demo)ref2;   //downcasting
		System.out.println(ref3.z);
		ref3.display();
	}
}