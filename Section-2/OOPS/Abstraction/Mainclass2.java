interface DAO                                  // 1] OBJECT IMPLEMENTATION LAYER
{											   // 1a]GENERALISED methods created in SUPER INTERFACE to provide access to the services 
	public void create();					   // it resticts the user to only acess the methods declared in INTERFACE 
	public void get();
	public void update();
	public void delete();
}
class MySqlDB implements DAO 				 // MySqlDB implementing DAO interface	
{											 // 1b] Implentation class (I) for OBJECT implementation layer process 
	MySqlDB()
	{
		System.out.println("You are connected with MySqlDB..!");
	}
	public void create()
	{
		System.out.println("MySqlDB created..");
	}
	public void get()
	{
		System.out.println("MySqlDB selected data got from server..");
	}
	public void update()
	{
		System.out.println("MySqlDB updated..");
	}
	public void delete()
	{
		System.out.println("MySqlDB selected record deleted..");
	}
	public void hiddenmethod1()             // property of MySqlDB which is hidden from user or Not acessible by Upcasted ref
	{										// this is called ABSTRACTION (Method hiding from user)
		System.out.println("H");
	}
}
class MangoDB implements DAO                      // MangoDB implementing the DAO
{												  // 1c] Implementation class (II) for OBJECT implementation layer process
	MangoDB()									  
	{
		System.out.println("You are connected with MangoDB..!");
	}
	public void create()
	{
		System.out.println("MangoDB created..");
	}
	public void get()
	{
		System.out.println("MangoDB selected data got from server..");
	}
	public void update()
	{
		System.out.println("MangoDB updated..");
	}
	public void delete()
	{
		System.out.println("MangoDB selected record deleted..");
	}
}
class Spring   //here spring class represents Spring framework // 2] OBJECT CREATION LAYER (Dependency injection by Spring framework)
{
	Spring()
	{
		System.out.println("Connecting with DataBase Server..");
	}
	public DAO createDBOject(String type)    
	{
		if(type.equalsIgnoreCase("MySqlDB"))
		{
			DAO db = new MySqlDB();
			return db;						// explicitely done upcasting and returning upcasted ref to Object utilization
		}
		else //if(type.equalsIgnoreCase("MangoDB"))
		{
			MangoDB db1 = new MangoDB();
			return db1;						// javac will implicitely perform Upcasting and return upcasted ref
		}
	}

}
class Mainclass2                              // 3] OBJECT UTILIZATION LAYER
{
	public static void main(String[] args) 
	{
		Spring s = new Spring();              // all the acessible service methods will call by user in utilization process
		DAO d = s.createDBOject("MySqlDB");
		d.create();
		d.get();
		d.update();
		d.delete();
		System.out.println();
		DAO d1 = s.createDBOject("MangoDB");
		d1.create();
		d1.get();
		d1.update();
		d1.delete();
	}
}