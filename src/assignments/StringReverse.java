package assignments;

public class StringReverse 
{
 public static void main(String[] args)
 {
	String s = "india is my country";
    String [] words =s.split(" ");
    
    for (int i = words.length-1; i < words.length; i--)
    {
     	System.out.print(words[i]);
    }
 }
	
}
   