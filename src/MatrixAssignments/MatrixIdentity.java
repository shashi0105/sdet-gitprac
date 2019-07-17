package MatrixAssignments;
public class MatrixIdentity 
{
	public static void main(String[] args)
	{
		int [] [] a ={{1,0,0},{0,1,0},{0,0,1}};	 
		if(a[0][0]==1 && a[1][1]==1 && a[2][2]==1 && a[0][1]==0 && a[0][2]==0 && a[1][0]==0 && a[1][0]==0 && a[2][0]==0 && a[2][1]==0)
		{
			System.out.println("Matrix is an identity matrix");
		}else
		 {
		  System.out.println("Matrix is not an identity matrix");
		 }                  
	}
}
