package assessment;
import java.util.Scanner;
public class AtmTranscations 
{
 public static void main(String[] args)
 {
 int balance=1000; 
 int withdraw, deposit;
 
 
 Scanner s=new Scanner(System.in);


while(true)
{
System.out.println("Enter your secret pin number=");
System.out.println("Welcome to ATM service");
System.out.println("1.Check Balance");
System.out.println("2.Withdraw Cash");
System.out.println("3.Deposit Cash");
System.out.println("4.Quit");
int n=s.nextInt();

switch(n)

{
case(1):
{
System.out.println("Your balance in rs."+balance);
System.out.println("");
}
break;
case(2):
{
System.out.println("Enter the amount to withdraw:");
withdraw=s.nextInt();
if (balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("Please collect cash");
System.out.println("Your current balance is "+balance);
}
else
{
System.out.println("Insufficient Balance");
}
}
break;
case(3):
{
System.out.println("Enter the amount to be deposit");
deposit=s.nextInt();
balance=balance=deposit;
System.out.println("your available balance"+balance);
}
break;
case(4):
{
System.out.println("Thank you using ATM");	
}
}
}
}
}
