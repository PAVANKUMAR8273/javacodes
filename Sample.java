class Sample
{
	static int num=10;
	public static void as()
	{
		num=50;
	}
	public static void main(String[] args) 
	{ 
		//num=20;
		int i=10;
		double d=i;  // widening

		double d1=2.45;
		int i1= (int)d1; // narrowing (casting stmts)
		as();
		System.out.println(num);
		System.out.println("i :"+i);
		System.out.println("d :"+d);
		System.out.println("i1 :"+i1);
		System.out.println("d1 :"+d1);

	}
}