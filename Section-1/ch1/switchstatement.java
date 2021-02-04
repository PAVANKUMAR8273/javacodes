class switchstatement
{

	public static void quiz(char optn)
	{
		System.out.println("optn :" +optn);

		switch(optn)
		{
			case 'A' : System.out.println("optn A is selected");
			break;
			case 'B' : System.out.println("optn B is selected");
			break;
			case 'C' : System.out.println("optn c is selected");
			break;
			case 'D' : System.out.println("optn D is selected");
			break;
			default : System.out.println(" invalid option ");
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