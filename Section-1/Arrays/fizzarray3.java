class fizzarray3
{
	public static int[] fizzArray3(int start, int end) 
 	{
  		int[] fizzarray=new int[end-start];
  		for(int i=0;i<end-start;i++)
  		{
    		fizzarray[i]=start++;
  		}
  		printarray(fizzarray);
  	return fizzarray;
  }
  public static void main(String[] args) 
  {
  	System.out.println(fizzArray3(5,10));
  }
  public static int[] printarray(int[] fizzarray)
  {
  	for(int i=0;i<fizzarray.length;i++)
  	{
  		System.out.println(fizzarray[i]);
  	}
  	return fizzarray;
  }
}