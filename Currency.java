import java.util.Scanner;

public class Currency {

	public static void main(String[] args) 
	{
		System.out.println("enter \n"
				+"1.for USD to INR \n"
				+"2. for INR to USD\n"
				+"3.for YEN to INR \n"
				+"4. for INR to YEN \n"
		        +"5. for EURO to INR \n"
		        +"6. for INR to EURO \n");
		Scanner sur = new  Scanner(System.in);
		int choice = sur.nextInt();
		switch(choice)
		
		{
			case 1 :usdtoinr();
			break;
			case 2 :inrtousd();
			break;
			case 3:yentoinr();
			break;
			case 4:inrtoyen();
			break;
			case 5:eurotoinr();
			break;
			case 6:inrtoeuro();
			break;
		
	}
		}

	public  static void usdtoinr()
	{
	Scanner sur =new Scanner(System.in);
	Double usd,inr;
	System.out.println("enter the amount in ruppes:");
	inr =sur.nextDouble();
	usd=inr/(82.73);
	System.out.println(usd+"dollars")	;
	}
public static void inrtousd()
{
	Scanner sur =new Scanner(System.in);
	Double inr,usd;
	System.out.println("enter the amount in dollares");
	usd=sur.nextDouble();
	inr=usd*(82.73);
	System.out.println("RS."+inr);
	
}
public static void yentoinr() 
{
	Scanner sur =new Scanner (System.in);
	Double yen,inr;
	System.out.println("enter the amount in yen");
	yen=sur.nextDouble();
	inr=yen/(1.65);
	System.out.println("Rs."+inr);
	
}
public static void inrtoyen()
{
	Scanner sur =new Scanner (System.in);
	Double yen,inr;
	System.out.println("enter the amount in ruppes");
	inr=sur.nextDouble();
	yen=inr*(1.65);
	System.out.println(yen+"dollars");
	
}
public static void eurotoinr()
{
	Scanner sur =new Scanner(System.in);
	Double euro,inr;
	System.out.println("enter the amount in euro");
	inr=sur.nextDouble();
	euro=inr*(87.25);
	System.out.println(euro+"euro");
	
}
public static void inrtoeuro()
{
	Scanner sur =new Scanner(System.in);
	Double euro,inr;
	System.out.println("enter the amount in ruppes");
	euro=sur.nextDouble();
	inr=euro/(87.25);
	System.out.println("Rs"+inr);
}

}
	

