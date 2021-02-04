class fix34
{
	public static int[] fix34(int[] nums) 
	{
		int t=0;
  		for(int i=0; i< nums.length ; i++)
  		{
    		for(int j=0;j<nums.length ; j++)
    		{
        		if(nums[i]==4 && nums[j]==3)
        		{
          			t=nums[j+1];
          			nums[j+1]=nums[i];
          			nums[i]=t;
        		}
   			}
  		}
  		printarray(nums);
  		return nums;
	}
	/*public static int[] fix34(int[] nums)           // alternative code for fix34
	{
		for (int i=0; i<nums.length-1; i++) 
		{
			if (nums[i] == 3 && nums[i+1] != 4) 
			{
			swapWithFour(nums, i+1);
			}
		}
		printarray(nums);
		return nums;
	}

	private static void swapWithFour(int[] nums, int n) 
	{
		int swapIndex = 0;
		//	if (nums[0] == 4) swapIndex = 4;

			for (int i=1; i<nums.length; i++) 
			{
				if (nums[i-1] != 3 && nums[i] == 4) 
				{
				swapIndex = i;
				break;
				}
			}
		nums[swapIndex]=nums[n];
    	nums[n] = 4;
	}
	*/
	public static void main(String[] args) 
	{
		int[] nums={1,3,1,4,4,3,1};
		System.out.println(fix34(nums));
	}
	public static int[] printarray(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		return nums;
	}
}