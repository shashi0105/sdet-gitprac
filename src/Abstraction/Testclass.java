package Abstraction;

public class Testclass {

	public static void main(String[] args) 
	{
		TwoWheeler t2 = new TwoWheeler();
		System.out.println(t2.setMaxSpeed(90));
		ThreeWheeler t3 = new ThreeWheeler();
		System.out.println(t3.setMaxSpeed(70));
		
	}

}
