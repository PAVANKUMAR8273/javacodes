package com.jspiders.libraries;

//java-Bean
class Employee
{
	private int Id;
	private String name;
	private String dept;
	private long sal;
	public Employee(int id, String name, String dept, long sal) 
	{
		super();
		Id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public int getId() 
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDept() 
	{
		return dept;
	}
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	public long getSal() 
	{
		return sal;
	}
	public void setSal(long sal) 
	{
		this.sal = sal;
	}
	public int hashCode()
	{
		return Id;
	}
	public String toString() 
	{
		return Id+" "+name+" "+dept+" "+sal;
	}
	public boolean equals(Object obj) 
	{
		if(this.Id==obj.hashCode())
		{
			return true;
		}
		return false;
	}
}

public class Mainclass {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Pavan","Dev",233565l);
		Employee e2 = new Employee(2,"Aanand","Dev",765443l);
		Employee e3 = new Employee(1,"Pavan","Dev",233565l);
		
		System.out.println(e1.hashCode());
		System.out.println(e1.toString());
		
		System.out.println(e2.hashCode());
		System.out.println(e2.toString());
		
		System.out.println(e3.hashCode());
		System.out.println(e3.toString());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
