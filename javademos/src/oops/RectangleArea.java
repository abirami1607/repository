package oops;
import java.util.Scanner;

public class RectangleArea extends BaseClass {
	void read_input() {
		Scanner s = new Scanner(System.in);
		width =s.nextInt();
		height=s.nextInt();
		}
	@Override
	void display()
	{
		System.out.println("Area of a rectangle"+width*height);
	}
	public static void main(String[] args)
	{
		RectangleArea sh=new RectangleArea();
		sh.read_input();
		sh.display();
	}
}
