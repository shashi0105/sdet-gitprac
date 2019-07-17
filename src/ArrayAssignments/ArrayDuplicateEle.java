package ArrayAssignments;

public class ArrayDuplicateEle
{

	public static void main(String[] args)
	{
		
		int counter=0;
		int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};	
		for (int i = 0; i < arr.length; i++)
		{
		  for (int j =i+1; j < arr.length; j++)
		  {
			 if(arr[i]==arr[j])
			 {
				System.out.println(arr[i]);
			    counter++;
			    break;
			 }
		  }	
		}
		System.out.println("number of repeated elements = "+ counter);
	}
}
