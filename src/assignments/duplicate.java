  package assignments;

  public class duplicate {

  public static void main(String[] args) {
		int i,k,j;
		String[]names={"Vijay","Sandeep","Ankush","nainamaina","Lala","kumar"};
		for( i=0 ; i<names.length; i++)
		{
			char[] l = names[i].toCharArray();
			for(j=0; j<l.length;j++)
			{
			    for( k=j+1; k<l.length;k++)
				{
				  if(l[j]==l[k])
				  {  
					System.out.println(names[i]);  
					break;
				  }
				  
				}
					
			}
		
			
		}
		
	}

}
