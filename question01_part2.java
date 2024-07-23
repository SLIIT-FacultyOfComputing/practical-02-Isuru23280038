import java.util.Scanner;

public class question01_part2 
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
	
	String full_name = (firstname + " " +middlename + " " +lastname);
	System.out.printf("Full name:%s",full_name );
	
	System.out.println("Enter your full name again");
	String fullname = myobj.nextLine();
	
	if (fullname.equalsIgnoreCase(full_name))
	{
	System.out.println("Enter your full name sucesful");
	System.out.printf("%s",fullname);
	} 
	else
	{
	System.out.println("Try again!!");
	
	}
	}
}
