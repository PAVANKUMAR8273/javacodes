class assignment
{
	public static void test(int num)
	{	
		System.out.println("Using FOR loop");
		for(int count=num; count>=1; count--)
		{	
			int n=count;
			System.out.println(n);
		}
	}

	public static void testw(int num)
	{	
		System.out.println("Using WHILE loop");
		int count=10;
		while(count>=1)
		{
			 int n=count;
			System.out.println(n);
			count--;
		}

	}

	public static void testd(int num)
	{
		System.out.println("Using DO WHILE loop");

		int count=10;
		do
		{
			int n=count;
			System.out.println(n);
			count--;
		}while(count>=1);
	}

	public static void main(String[] args) {
		System.out.println(" assignment : to print num from n to 1 in decreasing order");

		test(10);

		testw(10);

		testd(10);

		System.out.println(" assignment successful..");
	}
}