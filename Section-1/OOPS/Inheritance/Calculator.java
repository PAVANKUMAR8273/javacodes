import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
class Calculator
{
	public static void main(String[] args) throws Exception
	{
		//Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Enter first number- ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);  
		int a= Integer.parseInt(br.readLine());
		System.out.println("Enter second number- ");  
		InputStreamReader is1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(is);  
		int b= Integer.parseInt(br1.readLine());

		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.println("Enter operation to perform (enter add for addtion,sub for..,mul for..,div for..): ");  
		String op= sc.nextLine();


		Sci ref=new Sci();
		//ref.demo();
		switch(op)
		{
			case "add":ref.add(a,b);
			break;
			case "sub":ref.sub(a,b);
			break;
			case "mul":ref.mul(a,b);
			break;
			case "div":ref.div(a,b);
			break;
	    }
	} 
}


class Simple            // will update this code again
{
   	public void add(int i,int j) // just for reference we only use int data type now for all
   	{
   		System.out.println("add : "+(i+j));
   	}
   	public void sub(int i,int j)
   	{
   		if(i>j) System.out.println("sub : "+(i-j));
   		if(i<=j) System.out.println("sub : "+(j-i));
   	}
   	public void mul(int i,int j)
   	{
   		System.out.println("mul : "+(i*j));
   	}
   	public void div(int i,int j)
   	{
   		System.out.println("div : "+(i/j));
   	}
}

class Sci extends Simple
{
	public void demo()
	{
		//System.out.println();   here will write some scientific code later
	}
}

