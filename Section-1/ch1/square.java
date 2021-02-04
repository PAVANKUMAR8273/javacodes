class square
{
	public static void sq(int num)
	{
	for(int count=1; count<=num; count++)
	  { 
		int n= count*count;
		System.out.println(n);
	  }
	}
	public static void main(String[] args) 
	{
		System.out.println("start..");

		sq(5);
		sq(6);

		System.out.println("stop..");	
	}
}