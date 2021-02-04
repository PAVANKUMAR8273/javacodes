class program2
{
    public static void calsi(double p, double t, double r)
     {
    	//body of method
    	double si; //output 

    	//process
    	si = p*t*r/100;
         
        System.out.println(" si = "+ si); 
         


    	return;
    }	




	public static void main(String[] args) 
	{
		
        System.out.println("program starts..");
        /*  call the method and 
            pass input values */

         calsi(1000.0,2.5,3.5);
        


        System.out.println("program ends..");
		
	}
}