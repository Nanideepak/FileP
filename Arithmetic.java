import java.util.*;
public class Arithmetic 
{

	public static void main(String[] args) 
	{
	Double x,y,res;
	char op;
	Scanner sur = new Scanner(System.in);
	System.out.println("enter the first number:");
	x=sur.nextDouble();
	System.out.println("enter the second number:");
	y=sur.nextDouble();
	System.out.println("ente the number of operation to be performed (+,-,*,/");
	op=sur.next().charAt(0);
	switch(op)
	{
	case '+':res=x+y;
	System.out.println(x+"+"+y+"="+res);
	break;
	case '-':res=x-y;
	System.out.println(x+"-"+y+"="+res);
	break;
	case '*':res=x*y;
	System.out.println(x+"*"+y+"="+res);
	break;
	case '/':res=x/y;
	System.out.println(x+"/"+y+"="+res);
	break;
	}
	
sur.close();
	}

}
