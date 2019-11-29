package assessment;
import java.util.*;

public class Greatt implements FindingMax {
	
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	@Override
	public void max() {
		if(a>b) {
			System.out.println("maximum value if"+a);
		}
		else {
			System.out.println("maximum value if"+b);
		}
		
	}

}
