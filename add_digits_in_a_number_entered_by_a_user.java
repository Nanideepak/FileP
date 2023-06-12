import java.util.*;
public class add_digits_in_a_number_entered_by_user
{

	public static void main(String[] args) 
	{
		int number;
		System.out.println("enter the number to find sum of digits:");
		Scanner dee = new Scanner(System.in);
		number = dee.nextInt();
		int sum = 0;
		while(number >0)
		{
			int lastDigit = number % 10;
			number =number /10;
			sum =sum + lastDigit;
			
		}
		System.out.println("sum of all digits is:"+sum);

	}

}
