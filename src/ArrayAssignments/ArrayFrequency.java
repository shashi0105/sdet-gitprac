package ArrayAssignments;

public class ArrayFrequency
{

	public static void main(String[] args)
	{
		int counter = 0;
		int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
		  for (int i = 0; i < arr.length; i++)
		   {
			      counter = 0;
			      System.out.print(arr[i]+" :");
			      for (int j=i; j < arr.length; j++) 
			      {
			    	  if (arr[i]==arr[j]) 
			    	  {
			    		  counter++;
			    		  if(arr[j]==arr[i]||arr[j]==arr[i+1] ||arr[j]==arr[i+2]||arr[j]==arr[i+3])
                          {
			    		  continue; 
			    	      }
                         
	  				  }
			      }
			      System.out.print(counter+"\n");
			}
	   
	}
}
