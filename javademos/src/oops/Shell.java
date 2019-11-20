package oops;

public interface Shell {
	int x = 10;
	String color="blue";
			
	void draw();
	void getArea();
	//void seArea();
	//void fillColor();
	
	default void applycolor() {
		System.out.println("Color applied");
	}
    static void displayColor() {
	 System.out.println("Applied color is %s");
}
}