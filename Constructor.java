public class Constructor
{
int id;
String name;
Constructor()
{
	System.out.println("it is a default constructor ");
	System.out.println("student id "+id+ "\nstudent name "+name);
	
}
Constructor(int i,String n)
{
	System.out.println("it is a parmeterized constructor:");
	id = i;
	name =n;
	System.out.println("student id "+id+"\n student name "+name);
}
	public static void main(String[] args)
	{
	Constructor s = new Constructor();
	Constructor student = new Constructor(10,"deepak");

	}

}
