package assignments;

public class StringDigitReplace
{
  public static void main(String[] args)
  {
	char x;  
	String f= "Te5t1n95ha5tra";
	String Y= "1234567890";
	char[] Y1 = Y.toCharArray();
	String temp="xyz";
	for(int z=0; z<f.length() ;z++ )
	{
		//System.out.print(f.charAt(z)+" ");
		for(int k=0; k<Y.length(); k++)
		{	
		  if(f.charAt(z)==Y.charAt(k))
		  {
	     temp = f.replace(f.charAt(z), 'x');
		  }
		 	 
	    }
		 System.out.print(temp); 		
		    
		
	}
   }
}  
  
/*for(int j=0; j<10 ; j++)
{	   if(f1[z]==j)
   {
	   x=f1[z];
   //System.out.println(x);
   }
   System.out.println(f1[z]);
}
//*/