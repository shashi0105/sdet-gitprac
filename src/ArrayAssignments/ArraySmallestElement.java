package ArrayAssignments;

public class ArraySmallestElement 
{

	public static void main(String[] args) 
	{
	  int temp=99999999,counter=0; int temp1=0;
	  int [] arr ={25,27,3,13,35,7,23,75,};	
	  for (int i = 0; i < arr.length; i++)
	  {
	   counter++;
	   if(temp>arr[i])
	     {
		   temp=arr[i]; 
	     }
	  }
	  System.out.println("smallest number from given array = "+temp);
	  System.out.println("number of elements is an array = "+counter );
	  System.out.println("number of elements is an array = "+arr.length );
	
	  for (int i = 0; i < arr.length; i++)
	  {
       if(temp1<arr[i])
	     {
		   temp1=arr[i]; 
	     }
	  }
	  System.out.println("largest number from given array = "+temp1);
	}
}
