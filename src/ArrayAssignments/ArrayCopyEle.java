package ArrayAssignments;

public class ArrayCopyEle 
{

	public static void main(String[] args)
  {
		int [] s = {15,7,6,27,9};
		int [] s1 =new int [s.length];
		//before copy
		System.out.println("Elements of Array s1 before  copy = ");
		for (int i = 0; i < s1.length; i++)
		{
		System.out.print( s1[i]+" ");
		}
		//after copy
		System.out.print("\nElements of Array s1 after  copy = ");
		for (int j =0; j<s1.length; j++) 
		{
			s1[j]=s[j];
	    
	    }
		System.out.println(" ");
		for (int j =0; j<s1.length; j++){
			
			System.out.print(s1[j]+" ");
		}  
  }

}
