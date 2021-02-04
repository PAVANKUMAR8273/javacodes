import java.util.*;  
class User   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.println("Enter first number- ");  
int a= sc.nextInt();  
System.out.println("Enter second number- ");  
int b= sc.nextInt();  
System.out.println("Enter third number- ");  
int c= sc.nextInt();  
int d=a+b+c;  
System.out.println("Total= " +d);  
}  
}