package overriding;

public class Child extends Parent {
	void m3() {
		System.out.println("m3 method");
	}
	void m4() {
		System.out.println("m4 method");
	}
	void m1() {
		System.out.println("Child class m1 method");
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}

}
