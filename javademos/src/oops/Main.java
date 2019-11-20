package oops;

public class Main {
	public static void main(String[] args) {
		Shell s=new Cell();
		s.draw();
		s.getArea();
		s.applycolor();
		Shell.displayColor(); //static method can be accessed only using interface name
	}

}
