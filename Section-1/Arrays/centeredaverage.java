class centeredaverage
{
    int[] nums={1,2,3,4,100};
    int large=largest(nums);
    int small=smallest(nums);
    
    int sum=0;
    int middle=0;
  public static void main(String[] args) 
  { 
        int[] nums={1,2,3,4,100};
        int[] nums1={1,1,1,1,4,5,6,50};

        System.out.println("largest :"+largest(nums));
        System.out.println("smallest :"+smallest(nums));
        System.out.println("centered average :"+centeredAverage(nums)); 

        System.out.println();

       
        System.out.println("largest :"+largest(nums1));
        System.out.println("smallest :"+smallest(nums1));
        System.out.println("centered average :"+centeredAverage(nums1));
  }
  public static int centeredAverage(int[] nums)
 {
 
  int sum=0;
  int middle=0;
  int large=largest(nums);
  int small=smallest(nums);


  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]==large)
    {
      nums[i]=0;
      break;
    }
  }
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]==small)
    {
      nums[i]=0;
      break;
    }
  }
  for(int i=0;i<nums.length;i++)
  {
    sum+=nums[i];
  }

  middle=(sum/(nums.length-2));
  return middle;
 }
 public static int largest(int[] nums)
 {
  int large=0;
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]>large)
    {
      large=nums[i];
    }
  }
  return large;
 }
 public static int smallest(int[] nums)
 {
  int small=10000;
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]<small)
    {
      small=nums[i];
    }
  }
  return small;
 }
}

