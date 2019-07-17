package MatrixAssignments;

public class MatrixAddition
{

	public static void main(String[] args)
	{
	  System.out.println("Addition of two matrices is ");	
	  int[][] a ={{1,0,1},{4,5,6},{1,2,3}};
	  int[][] b ={{1,1,1},{2,3,1},{1,5,1}};	
	
	  for (int i = 0; i <a.length; i++) //b.length
	  {
		 for (int j = 0; j <a.length; j++) //b.length
		 {
			System.out.print(a[i][j]+b[i][j]+" ");
		 }
		 System.out.println(" ");
	  } 
	
	
	}

}
	