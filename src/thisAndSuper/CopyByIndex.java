package thisAndSuper;

public class CopyByIndex {

	int a =10;
	static String name ="sunil";
	
	public CopyByIndex()
	{
		System.out.println("I am Constructor");
	}
	
	private void m1() 
	{
		System.out.println("i am method");
		System.out.println(this.a);
		System.out.println(this.name);
		//this.m1();
		CopyByIndex c =this;
		System.out.println(c.a);
	}
	
	public static void main(String[] args) {
		CopyByIndex d =new CopyByIndex();
		d.m1();
	}

}
