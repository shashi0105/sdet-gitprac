package MatrixAssignments;

public class MatrixSubstraction 
{
    public static void main(String[] args)
	{
    	System.out.println("Substraction of two matrices is ");
		int[][] a ={{4,5,6},{3,4,1},{1,2,3}};
		int[][] b ={{2,0,3},{2,3,1},{1,1,1}};	
		
		  for (int i = 0; i <a.length; i++) //b.length
		  {
			 for (int j = 0; j <a.length; j++) //b.length
			 {
				System.out.print(a[i][j]-b[i][j]+" ");
			 }
			 System.out.println(" ");
		  } 

	}

}
