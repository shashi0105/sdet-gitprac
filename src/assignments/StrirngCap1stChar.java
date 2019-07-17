package assignments;

public class StrirngCap1stChar {

	public static void main(String[] args) {
		
		String s ="ishwar is a proud indian";
        String[]s1=s.split(" ");
        for (int i=0; i<s1.length; i++)
        {
           for(int j=0; j<s1[i].length(); j++)
           {
        	   if(s1[i].charAt(j)==1)
        	   {
        	    System.out.print(s1[j].toUpperCase()); 
        	   }else
        	     {
        	      System.out.print(s1[i].charAt(j));
        	     }
           }	
             System.out.print(" ");
		}
	}

}
