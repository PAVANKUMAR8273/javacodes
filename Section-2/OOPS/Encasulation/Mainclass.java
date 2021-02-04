package com.jspiders.Encapsulation;

//java-Bean , Plain Old Java Object --> POJO
class UserAccount
{
	private int Id;      //read   (only get())
	private String name; //read   (only get())
	private String pwd;  //write  (only set())
	private long Mob;    // read or write (both get() and set())
	public UserAccount(int Id,String name, String pwd, long mob) 
	{
		this.Id=Id;
		this.name = name;
		this.pwd = pwd;
		this.Mob = mob;
	}
	public long getMob() 
	{
		return Mob;
	}
	public void setMob(long mob) 
	{
		Mob = mob;
	}
	public int getId() 
	{
		return Id;
	}
	public String getName() 
	{
		return name;
	}
	public void setPwd(String pwd) 
	{
		this.pwd = pwd;
	}	
}
//service
class AccountService
{
	private static UserAccount a1;
	private static int Id=1;
	public static UserAccount createAccount(String name,String pwd,long mob)
	{
		a1 = new UserAccount(Id,name,pwd,mob);
		Id++;
		return a1;
	}
	public static void showAccDetails()
	{
		System.out.println("Id :"+a1.getId());
		System.out.println("Name :"+a1.getName());
		System.out.println("Mob :"+a1.getMob());
	}
	public static void updatemob(long newmob)
	{
		System.out.println("old Mob : "+a1.getMob());
		a1.setMob(newmob);
		System.out.println("updated mob :"+a1.getMob());
	}
	public static void updatepwd(String newpwd)
	{
		System.out.println("updating password..");
		a1.setPwd(newpwd);
		System.out.println("password updated..");
	}	
}
public class Mainclass 
{

	public static void main(String[] args) 
	{
		AccountService.createAccount("Pavan","pavyayash",8317417061l);
		AccountService.showAccDetails();
		AccountService.updatemob(7204308273l);
		AccountService.updatepwd("pavanyash");
		AccountService.showAccDetails();
	}

}
