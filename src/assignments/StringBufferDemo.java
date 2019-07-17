package assignments;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s= "hello hello hello";
		s.concat("Testing Shastra");
//		System.out.println(s);
		
		StringBuffer sb= new StringBuffer("hello");
		
		sb.append("Testing Shastra");
	  //System.out.println(s);
		System.out.println(sb.capacity());
	}
 // newCapacity = (currentCapacity+1)*2
	
}
