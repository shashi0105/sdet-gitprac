package assignments;

public class StrinngAssignments 
   {

	    public static void main(String[] args) 
	    {
		String s= new String("Testing shastra is my current class ");
		String n = new String(s.concat(" shastra"));//"Testing shastra"
		String p= new String("game ");
		//System.out.println(s.concat(" shastra"));	
		//System.out.println(n);
		
		String s1=s.toUpperCase();
		String s2=n.toLowerCase();
	    int s3=n.length();
	    String s4 = n.replace('a','z');
	    String s5 = n.replaceAll(n, p);
	    String[] s6 = s.split(" ");
		System.out.println(s6);
	    }
	
	
   }
