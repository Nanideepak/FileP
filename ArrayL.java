import java.util.*;
public class ArrayL
{
	ArrayList<String> list=new ArrayList<String>();
public void arraydisplay()
{
list.add("CSE");
list.add("ISE");
list.add("ME");
System.out.println("ArrayLIst element are :");
System.out.println(list);
System.out.println("");
}
public void appentatend()
{
	Scanner scob1 = new Scanner(System.in);
	System.out.println("enter the array elemnts to append at end:");
	String ele = scob1.next();
	list.add(ele);
	System.out.println(list);
	System.out.println(" ");
	
}
public void insertatpos()
{
	Scanner scob1 =new Scanner(System.in);
	System.out.println("enter the array elements insert at positon");
	int posind = scob1.nextInt();
	String ele = scob1.next();
	list.add(posind,ele);
	System.out.println(list);
	System.out.println(" ");
	
}
public void searchele()
{
	Scanner scobj = new Scanner (System.in);
	System.out.println("entr the elements to be search:");
	String arele= scobj.next();
	int in =list.indexOf(arele);
	if(in==-1)
	{
		System.out.println("element not found:");
	}
		else
		{
			System.out.println("element is found at postion:"+in);
	}

}
void print()
{
	Scanner nip = new Scanner (System.in);
	System.out.println("enter the character to be print:");
	char inputc = nip.next().charAt(0);
	String strc =Character.toString(inputc);
	System.out.println("String starting with character :"+strc);
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).startsWith(strc))
		{
			System.out.println(list.get(i));
		}
	}
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
ArrayL obj =  new ArrayL();
obj.arraydisplay();
obj.appentatend();
obj.insertatpos();
obj.searchele();
obj.print();
	}

}
