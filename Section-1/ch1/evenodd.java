class evenodd
{	
	public static void evenfor(int num)
	{	
		System.out.println("Using FOR loop");

		for(int try1=1;try1<=num;try1++)
		{	
			int n=try1;
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
	}

	public static void evenwhile(int num)
	{
        System.out.println("Using WHILE loop");

        int count2=1;

		while(count2<=num)
		{
			if(count2%2==0)
			{	
				System.out.println(count2);
				
			}
			count2++;
		}
	}

	public static void evendowhile(int num)
	{
        System.out.println("Using DO WHILE loop");
        int count3=1;
		do
		{
			if(count3%2==0)
			{
				System.out.println(count3);
				
			}
			count3++;
		}while(count3<=num);
    }

	public static void main(String[] args) {
		System.out.println("assignment : to print even numbers in given n values");

		evenfor(10);
		evenwhile(10);
		evendowhile(10);

		System.out.println("EVEN values printed..");

		System.out.println("assignment : to print odd numbers in given n values");
		
		oddfor(10);
		oddwhile(10);
		odddowhile(10);

		System.out.println("ODD values printed..");

		
	}
	public static void oddfor(int num)
	{	
		System.out.println("Using FOR loop");

		for(int try1=1;try1<=num;try1++)
		{	
			int n=try1;
			if(n%2!=0)
			{
				System.out.println(n);
			}
		}
	}

	public static void oddwhile(int num)
	{
        System.out.println("Using WHILE loop");

        int count2=1;

		while(count2<=num)
		{
			if(count2%2!=0)
			{	
				System.out.println(count2);
				
			}
			count2++;
		}
	}

	public static void odddowhile(int num)
	{
        System.out.println("Using DO WHILE loop");
        int count3=1;
		do
		{
			if(count3%2!=0)
			{
				System.out.println(count3);
				
			}
			count3++;
		}while(count3<=num);
    }
}