import java.util.Scanner;

public class question01 
{
	public static void main(String[] args)
	{
	Scanner myobj = new Scanner(System.in);
	
	System.out.println("Enter your first name:");
	String firstname = myobj.nextLine();
	
	System.out.println("Enter your middle name:");
	String middlename = myobj.nextLine();
	
	System.out.println("Enter your last name:");
	String lastname = myobj.nextLine();
	
	System.out.println("Full name:" +firstname + " " +middlename + " " +lastname);
	
	
	}
}
