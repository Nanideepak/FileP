import java.util.*;

public class prime_num 
{

	public static void main(String[] args)
	{
		Double num;
		int i;
		Scanner sur = new Scanner(System.in);
		System.out.println("entr the number\n");
		num = sur.nextDouble();
		boolean flag =false;
		for ( i=2;i<=num/2;++i)
		{
			if(num%1==0)
			{
				flag=true;
			}
		}
			
				if(!flag)
					System.out.println(num+"is  prime number");
				else
				System.out.println(num+"is not prime number");
		
			
			sur.close();
		
	}

}
