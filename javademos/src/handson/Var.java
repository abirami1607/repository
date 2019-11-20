package handson;

public class Var {
	
 static int sum;

	public static void main(String... args) {
	add(1, 2, 3, 4);
		
	}
	static void add(int...a) {
	for(int i:a) {
		sum+=i;
	
	}
	System.out.println(sum);	
}
}
