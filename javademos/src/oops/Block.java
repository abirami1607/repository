package oops;

public class Block {
	int x=10;
	int y=20;
	static String name;
	static int z=10;
	static int w=20;
	//Constructor
	Block()
	{
		System.out.println("Inside constructor");
	}
	//static block
	static
	{
		name="Abirami";
	System.out.println("Name is: "+name);
		System.out.println("Inside static block");
		System.out.println("Multiplication result: "+z*w);
	}
	//instance block
	{
		System.out.println("Inside instance");
		System.out.println("Addition result: "+(x+y));
	}
	//main method
	public static void main(String[] args) {
	
		System.out.println("Inside main");
		Block s=new Block();
	}

}
