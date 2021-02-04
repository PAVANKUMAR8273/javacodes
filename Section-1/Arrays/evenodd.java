class evenodd
{
	public static boolean evenodd(int[] a)
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		if(even==odd)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,7,8,9,0};
		System.out.println(evenodd(a));
		
	}
}