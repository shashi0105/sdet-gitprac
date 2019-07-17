package ArrayAssignments;

public class ArrayEleReverse 
{

	public static void main(String[] args)
	{
	   int [] src = {5,7,9,6,7,2,7};
	   System.out.println("genral order ");
	   for (int i = 0; i < src.length; i++) 
       {
    	   System.out.print( src[i]+" ");
	   }
	   System.out.println("\nReverse order ");
       for (int i = src.length-1; i>=0; i--) 
       {
    	   System.out.print(src[i]+" ");
	   }
		
	}

}
