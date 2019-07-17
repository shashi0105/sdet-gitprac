package ArrayAssignments;

public class ArrayElementsAddition {

	public static void main(String[] args)
	{
	 int result=0;	
	 int [] arr = {10,25,15,18,32};
	 for (int i = 0; i < arr.length; i++) 
	    {
		 result = result+arr[i];
	    }
	  System.out.println("Addition of all numbers = "+ result);
	}
}
