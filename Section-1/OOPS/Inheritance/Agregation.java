class Emp 
{                          // If a class have an entity reference,it is known as Aggregation.  
	int id;  		       // Aggregation represents HAS-A relationship.		
	String name;           // Example : Agregation of Address class with Employee class.
	Address address;       // Here we are passing a entire adress object as a parameter
                           // for emp class object   (Line : 42 and 43)
	public Emp(int id, String name,Address address) 
	{  
    	this.id = id;  
    	this.name = name;  
    	this.address=address;  
	}  
  
	void display()
	{  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
    
}

class Address 
{  
	String city,state,country;  
  
	public Address(String city, String state, String country) 
	{  
    this.city = city;  
    this.state = state;  
    this.country = country;  
	}  
  
}

public class Agregation
{
	public static void main(String[] args) 
	{  
		Address address1=new Address("Bangalore","Karnataka","india");  
		Address address2=new Address("Bangalore","Karnataka","india");  
  
		Emp e=new Emp(111,"Pavan",address1);  
		Emp e2=new Emp(112,"Pyro",address2);  
      
		e.display();  
		e2.display();
	}
}