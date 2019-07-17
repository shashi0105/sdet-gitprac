package assignments;
public class StringdigitAddN
{
	public static void main(String[] args)
    {
		String f="t5et7i9n5";
		int temp1=0;
		int temp[]=new int[f.length()];
	    String f1 = "0123456789";
		for (int i=1; i<f.length(); i++) 
		{
			for (int j=1; j<f1.length(); j++)
			{
			  if (f.charAt(i)==f1.charAt(j))
			  {
				  temp[i]=(int)f.charAt(i);
				  break;
			  }
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
