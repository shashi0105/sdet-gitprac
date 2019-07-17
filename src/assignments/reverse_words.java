package assignments;

public class reverse_words {

	public static void main(String[] args) {
		String f="I am an proud Indian ";
		String[]f1 = f.split(" ");
		for(int i=f1.length-1; i>=0; i--)
		{ 
		System.out.print(f1[i]+" ");
		}
	}

}
