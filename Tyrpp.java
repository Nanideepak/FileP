import java.util.*;

public class Tyrpp
{
int c;
void div(int a,int b)
{
	try 
	{
	c=a/b;
	System.out.println("result:"+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot divide by zero:");
	}
}
	public static void main(String[] args)
	{
Tyrpp obj =new Tyrpp();
Scanner sur =new Scanner(System.in);
System.out.println("enter the values of a and b:");
int no1=sur.nextInt();
int no2=sur.nextInt();
obj.div(no1, no2);


	}

}
