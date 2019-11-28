package handson;
import java.util.*;

public class MyComparator implements Comparator {

	@Override
	

		public int compare(Object obj1, Object obj2){
		String S1=(String)obj1;
		String S2=(String)obj2;
		return S2.compareTo(S1);
//		if(S1<S2)
//			return 1;
//		else if(S1>S2)
//			return -1;
//		else
//			return 0;
	}
//			Integer I1=(Integer)obj1;
//			Integer I2=(Integer)obj2;
//		if(I1<I2)
//		return 1;
//	else if (I1>I2)
//		return -1;
//	else
//		return 0;
//		
	}
	
	

