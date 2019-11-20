package oops;

public class Student {
	private int rollNo;
	private String name;
	
	Student(int no, String name){
		rollNo=no;
		this.name=name;
	}
public static void main(String[] args) {
	Student s1 = new Student(10, "rama");
	Student s2 = new Student(20, "Sita");
	System.out.println(s1.name);
	System.out.println(s2.name);
	System.out.println(s1.rollNo);
	System.out.println(s2.rollNo);
	
}
public void setrollNo(int val) {
	rollNo=val;
}
public int getrollNo() {

       return(rollNo);	
}

}