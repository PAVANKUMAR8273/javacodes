class commonEnd
{
	public static void main(String[] args) {
		System.out.println("start..");

		int[] num1={1,2,3};
		int[] num2={7,3};			//input arrays

		test(num1,num2);

		System.out.println(test(num1,num2));

		System.out.println("stop..");
	}
	public static boolean test(int num1[],int num2[])
	{
		if(num1[0]==num2[0]||num1[num1.length-1]==num2[num2.length-1])
		{
			return true;
		}
		return false;
	}
}