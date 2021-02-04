class program1
{
    public static double calsi(double p, double t, double r)
     {
    	//body of method
    	double si; //output 

    	//process
    	si = p*t*r/100;


    	return si;
    }	




	public static void main(String[] args) 
	{
		
        System.out.println("program starts..");
        /*store the output               call the method and 
        val return from method           pass input values */

        double res = calsi(1000.0,2.5,3.5);
        System.out.println(" si = "+ res);


        System.out.println("program ends..");
		
	}
}