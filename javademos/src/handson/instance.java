package handson;

public class instance {
	int a=10;
	int sum=20;                                         //instance variable
	public static void main(String[] args) {            //static method
	                                              
	instance s=new instance();                         //creating a object to access instance variable in static field
	
	add(1, 2, 3, 4);                                   //accessing instance variable
	System.out.println(add);
	
	}
    int add(int...a) {
    	for(int i:a) {
    		sum+=i;
    	
    	}
    }
}
