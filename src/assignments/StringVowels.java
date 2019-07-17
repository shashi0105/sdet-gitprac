package assignments;

public class StringVowels {
    char a; char e; char i; char o; char u;int z ;
	public static void main(String[] args) 
	{
		String g = "hello world";
	    char[] g1 = g.toCharArray();
	    int counter=0;
	    for(int z=0; z<g1.length; z++)
	    { 	
	    	if(g1[z]=='a' || g1[z]=='e' ||g1[z]=='i' ||g1[z]=='o' ||g1[z]=='u' )
	    	{
	    	System.out.print(g1[z]+" ");
	    	System.out.println(z);
	    	counter++;
	    	}
	    	
	    }	
	    System.out.println("Total number of vowels present in given String = "+counter);
	
	 }

}
