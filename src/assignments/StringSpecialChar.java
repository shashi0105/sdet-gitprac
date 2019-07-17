package assignments;

public class StringSpecialChar
{

  public static void main(String[] args) 
  { 
	 int counter =0;	
	 String s ="S@p#e$ci%al Ch&ar!ac%ct$er";
	 char[] s1= s.toCharArray();
	
	 for (int i = 0; i < s1.length; i++) 
	 {
	   if(s1[i]== '@' || s1[i]=='#' || s1[i]=='$' || s1[i]=='&' || s1[i]=='!' || s1[i]=='%' )
	   {
		   System.out.print(s1[i]+" "); 
		   counter++;
	   }
	 }
	 System.out.println("\nTotal number of Special characters present in given String = "+counter);
	 
  }
}
