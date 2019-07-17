package assignments;

public class StringMArray {

	public static void main(String[] args) {
		String [] [] names = {{"Vijay","Ankush","Sandeep"},{"Kumar","Lal","Gaikwad"}};
        for(int i=0; i<names.length; i++ )
        {
        	for(int j=0; j<names[i].length; j++)
            {
        		if(i+1 <names.length)
        		{
        		System.out.println(names[i][j] +" "+names[i+1] [j]); 
        		}else
        		{
        		break;	
        		}    
            }
        	
        }
        
	}

}
