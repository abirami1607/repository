package assessment;
import java.util.*;

public class Application {
	public static void main(String[] args)
	{
		
	  int Availablerooms=20;
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choice ");
		System.out.println("1.Display room details");
		System.out.println("2.Display room availability ");
		System.out.println("3.Book");
		System.out.println("4.Order food");
		System.out.println("5.Checkout");
		System.out.println("6.Exit");
		int n=s.nextInt();

		switch(n)
		
		{
		case(1):{
			System.out.println("Choose room type : ");
			System.out.println("1. Luxury Double Room");
			System.out.println("2.Deluxe Double Room ");
			System.out.println("3. Luxury Single Room");
			System.out.println("4.Deluxe Single Room");
		    public void room();
			}
		break;
		case(2):
		{
			System.out.println("Number of rooms available=20");
			System.out.println("Continue : (y/n) ");
		}
		break;
		case(3):
		{
			System.out.println("Book now");
			Availablerooms=Availablerooms-1;
			
		}
			
		break;
		case(4):{
			System.out.println("1. Sandwich Rs.50"); 
			System.out.println("2. Pasta Rs.60"); 
			System.out.println("3. Noodles Rs.70");
			System.out.println("4. Coke Rs.30"); 
					
		}
		break;	
		}
		case(5):{
			
		
			System.out.println("checkout");
			number of rooms=number of rooms+1;
		}
		break;	
		}
		case(6):{
			System.out.println("Thank you!visit again!")
		}
		break;
		}
		
		
			
		
			
		
		
		
		
		
			
		public void room() {
			int sh=s.nextInt();
			switch(sh) {
			case(1):{
				System.out.println("Number of double beds : 1 ");
				System.out.println("AC : Yes ");
				System.out.println("Free breakfast : Yes ");
				System.out.println("Charge per day:4000 ");
				System.out.println("Continue : (y/n)");
			}
			break;
			case(2):{
				System.out.println("Number of beds : 1 ");
				System.out.println("AC : Yes ");
				System.out.println("Free breakfast : Yes ");
				System.out.println("Charge per day:2000 ");
				System.out.println("Continue : (y/n)");
			}
			break;
			case(3):{
				System.out.println("Number of double beds : 1 ");
				System.out.println("AC : Yes ");
				System.out.println("Free breakfast : Yes ");
				System.out.println("Charge per day:1000 ");
				System.out.println("Continue : (y/n)");
			}
			break;
			case(4):{
				System.out.println("Number of double beds : 1 ");
				System.out.println("AC : No ");
				System.out.println("Free breakfast : Yes ");
				System.out.println("Charge per day:500 ");
				System.out.println("Continue : (y/n)");
			}}
				
			
		



	
