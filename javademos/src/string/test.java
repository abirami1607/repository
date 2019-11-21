package string;

public class test {
	public static void main(String[] args) {
		String str1="Hello";
		System.out.println(str1);
		str1.concat("world");
		System.out.println(str1);  //output will be hello since we are not assigning the str1.concat("world") to any variable.String id immutable
		
		System.out.println();
		
		
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		
		
	
		
	}

}
