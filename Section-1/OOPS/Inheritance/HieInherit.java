class HieInherit
{
	public static void main(String[] args) 
	{

		Savings sref = new Savings();     // saving class object creation
		Current cref = new Current();
		sref.deposit(5000);
		sref.withdraw(1000);
		sref.checkbal();
		sref.checkroi();
		cref.checkminbal();


	}
}

class Account
{
	double AccN;
	String owner;
	double bal;
	public void deposit(int amt)
	{
		if(amt>0)
		{
			bal=bal+amt;
			System.out.println("Deposit Successful..");
			System.out.println("current bal : "+bal);
		}
		else
		{
			System.out.println("invalid key");
		}
	}
	public void withdraw(int amt)
	{
		if(amt<bal)
		{
			bal=bal-amt;
			System.out.println("withdraw Successful..");
			System.out.println("available bal : "+bal);
		}
		else
		{
			System.out.println("In-sufficient amount");
		}
	}
	public void checkbal()
	{
		System.out.println(bal);
	}
}

class Savings extends Account
{
	double minbal=0;
	double roi=2.5;
	public void checkroi()
	{
		System.out.println(roi);
	}
}

class Current extends Account
{
	double minbal=2000;
	double roi=3;
	public void checkminbal()
	{
		System.out.println(minbal);
	}
}