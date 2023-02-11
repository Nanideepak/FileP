import java.util.Scanner;

public class quad 
{

	public static void main(String[] args)
	{
	int a,b,c;
	Double d,r1,r2;
	System.out.println("enter the co-effecients:");
	Scanner sur =new Scanner(System.in);
	a=sur.nextInt();
	b=sur.nextInt();
	c=sur.nextInt();
	d=(double) ((b*b)-(4*a*c));
	if (d>0)
	{
		System.out.println("the roots real and equal");
		r1=(-b+Math.sqrt(d)/(2*a));
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.format("r1=%.2f and r2=%.2f\n",r1,r2);
	}
	else
		if (d==0)
	{
		
		System.out.println("roots are real ");
		r2=r1=(double) ((-b)/(2*a));
		System.out.format("r1=r2=%.2f",r1);
	}
	else
	{
	double real = -b/(2*a);
	double imag =Math.sqrt(-d)/(2*a);
	System.out.println("ente the real and imaginary");
	System.out.format("r1=%.2f and %.2f",real,imag);
	System.out.format("r2=%.2f and %.2f",real,imag);
	}
	
	}

}
