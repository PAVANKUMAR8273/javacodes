class ifstatement
{

	public static void quiz(char optn)
	{
		System.out.println("optn :" +optn);

		if(optn=='A')
		{
			System.out.println(optn +" optn is selected");
		}
		else if(optn=='B')
		{
			System.out.println(optn +" optn is selected");
		}
		else if(optn=='c')
		{
			System.out.println(optn + " optn is selected");
		}
		else if(optn=='D')
		{
			System.out.println(optn +"optn is  selected");
		}
		return;
	}
	public static void main(String[] args)
    {
		System.out.println("start");
		quiz('A');

		System.out.println("stop");	
	}
}