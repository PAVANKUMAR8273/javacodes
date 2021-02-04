class B
{
	public static int sum67(int[] nums)
	{
		boolean marker=false;
		int sum=0;
		for(int index=0;index<=nums.length-1;index++)
		{
			if(nums[index]==6)
			{
				marker=true;
			}
			if(marker!=true)
			{
				sum=nums[index]+sum;
			}
			if(nums[index]==7)
			{
				marker=false;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int nums[]={1,2,6,4,7,5,7,5};
	    int res=sum67(nums);
	    System.out.println(res);
	}
}