package FuncInterface;

public class Basic  {
	public static void main(String[] args) {
		EvenIntf sh=(num)-> {
			if(num%2==0) 
				{return true;
				}else {
					return false;
				}
				
		};
		
		System.out.println(sh.evenodd(10));
	
	 
}
}