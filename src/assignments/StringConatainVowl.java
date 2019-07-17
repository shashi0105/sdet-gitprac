package assignments;

public class StringConatainVowl {

	public static void main(String[] args) {
		String s = "hello wmrld java jnmd james";
        String [] s1= s.split(" ");
       for (int i = 0; i < s1.length; i++)
       {
		for (int j = 0; j<s1[i].length(); j++) 
		{
			if(s1[i].charAt(j)=='a' || s1[i].charAt(j)=='e' || s1[i].charAt(j)=='i' || s1[i].charAt(j)=='o' || s1[i].charAt(j)=='u')
			{
				System.out.print(s1[i]+" ");
				break;
			}
		}
       }
	}

}
