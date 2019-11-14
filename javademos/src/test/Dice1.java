package test;
import java.util.Scanner;
public class Dice1 {
	
public  static void main(String[] ab)
{
int val1,val2,val3;
Scanner sc1=new Scanner(System.in);
val1=sc1.nextInt();
val2=sc1.nextInt();
if(val1>=0&&val1<=6&&val2>=0&&val2<=6)
{
val3= val1+val2;
if (val3<8) 
{
val3=8-val3;
System.out.println("The point scored is"+val3);
}
else
{
int temp=Math.abs(8-val3);
System.out.println("The point scored is"+2*temp);
}
}
else
System.out.println("Invaild Input");
}
}
