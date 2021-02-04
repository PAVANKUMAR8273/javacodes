interface User
{
	public void login();
}
class MobileUser implements User
{
	public void login()
	{
		System.out.println("Login through Mobile app");
	}
}
class WebUser implements User
{
	public void login()
	{
		System.out.println("Login through Web Server");
	}
}
class Spring
{
	public User createUserObject(String type)
	{
		if(type.equalsIgnoreCase("web"))
		{
			User u1 = new WebUser();
			return u1;
		}
		else
		{
			User u2 = new MobileUser();
			return u2;
		}
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Spring sp = new Spring();
		User u1 = sp.createUserObject("web");
		u1.login();
		User u2 = sp.createUserObject("Mobile");
		u2.login();
	}	
}