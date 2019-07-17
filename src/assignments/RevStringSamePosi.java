package assignments;

public class RevStringSamePosi 
{

	public static void main(String[] args) 
	{
	  String s ="I am an proud Indian";
	  String[] s1 =s.split(" ");
	 // char s2[]=s.toCharArray();
	  
	  for (int i = 0; i<s1.length; i++)
	  {
	     for (int j =s1[i].length()-1; j>=0; j--)
		 {
			System.out.print(s1[i].charAt(j));
		 }
	     	System.out.print(" ");
	  }	  
	}
}
