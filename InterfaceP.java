interface Resume
{
	void biodata();
}
class Teacher implements Resume
{
		String name,qualification,achivements;
		float experience;
		public void biodata()
		{
			name="GURU PRASAD";
			qualification="M.TECH(PH.D)";
			achivements="Q1 publication";
			experience=8.6f;
			System.out.println("\nTeacher resume :");
			System.out.println("\nname:"+name);
			System.out.println("\nqualification:"+qualification);
			System.out.println("\nachivements:"+achivements);
			System.out.println("\nexperience:"+experience);
			
		}
		
	}
class Student implements Resume
{
	String name,discipline;
	float result;
	public void biodata()
	{
		name ="DEEPAK";
		discipline="information science and engneering ";
		result=9.8f;
		System.out.println("\n student resume: ");
		System.out.println("\n name :"+name);
		System.out.println("\n discipline:"+discipline);
		System.out.println("\n result:"+result);
	}
}

public class InterfaceP 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Teacher obj1= new Teacher ();
obj1.biodata();
Student obj2 = new Student ();
obj2.biodata();
	}

}
