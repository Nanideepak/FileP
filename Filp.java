import java.io.File;
import java.util.Scanner;
 class FileP 
 {

public static void main(String[] args)
{
@SuppressWarnings("resource")
Scanner obj = new Scanner(System.in);
String fname=obj.next();
File f1 = new File(fname);
System.out.println("File name "+f1.getName());
f1.setWritable(false);
System.out.println(f1.exists()?"file exists":"file does not exists");
System.out.println(f1.canWrite()?"file is writable":"file does not writable");
System.out.println(f1.canRead()?"file is readable ":"file does not readable");
String fileName = f1.toString();
int index = fileName.lastIndexOf('.');
if(index>0)
{
	String type  = fileName.substring(index+1);
	System.out.println("file type is :"+type);
	
}
else
{
	System.out.println("file doesnot exist :");
}
System.out.println("File size:"+f1.length()+"bytes");

	}

}
