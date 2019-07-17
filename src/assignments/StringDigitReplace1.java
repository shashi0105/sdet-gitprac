package assignments; 

public class StringDigitReplace1 
{
 public static void main(String[] args)
	{  
	        int counter=0;
			String f= "Te5t1n9 8ha7tra";
			char[] f4= f.toCharArray();
			String f1= "123456789";
			char[] f3= f1.toCharArray();			
		    for(int i=0; i<f4.length; i++)
		    {
		    	for(int z=0; z<f3.length;z++)
		  	    {
		          if(f4[i]==f3[z])
		           {
		    	    f4[i]='x';
		    	    counter++;
		           }
		         }
		    	 System.out.print(f4[i]);
	         }			
		     System.out.println("\nTotal digits present in string are "+counter);
	}//end main method

}//end class


