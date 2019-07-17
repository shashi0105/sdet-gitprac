package ArrayAssignments;

public class ArrayElePosiEvenOdd
{

	public static void main(String[] args)
	{
		int [] arr = {2, 8, 9, 7,4};
       for (int i = 0; i < arr.length; i++)
       {
		if(i%2 ==0)
		{
		    System.out.println(arr[i]+"number at even index position");
		}else
		 {
			System.out.println(arr[i]+"number at odd index position");	
		 }
	   }
	}

}
