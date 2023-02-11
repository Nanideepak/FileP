import java.util.Scanner;

public class stud_det
{
	String name,usn,branch;
	long phone;
	void insertStudent(String nm,String reg,String br,long ph)
	{
		name=nm;
		usn=reg;
		branch=br;
		phone=ph;
		
	}
	void displayStudent()
	{
		System.out.println("---------------");
		System.out.println("name"+name);
		System.out.println("usn"+usn);
		System.out.println("branch"+branch);
		System.out.println("phone number "+phone);
		System.out.println("-------------");
	}
	public static void main(String[] args)
	{
		stud_det st[]= new stud_det[100];
		Scanner sur = new Scanner(System.in);
		
		System.out.println("enter the number of students\n");
		int n=sur.nextInt();
		for (int i=0;i<n;i++)
		
			st[i]=new stud_det();
			for (int j=0;j<n;j++)
			{
				System.out.println("entrer the usn,name,branch,phone number");
				String name =sur.next();
				String usn=sur.next();
				String branch=sur.next();
				long phone =sur.nextLong();
				st[j].insertStudent(name, usn, branch, phone);
				
				
			}
			for(int m=0;m<n;m++)
			{
				System.out.format("Student %d details \n",m+1);
				st[m].displayStudent();
			}
		}

	}


