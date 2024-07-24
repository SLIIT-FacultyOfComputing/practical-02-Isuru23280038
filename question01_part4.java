import java.util.Scanner;

public class question01_part4
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
	System.out.printf("Full name:%s\n",full_name );
	
	System.out.println("Enter your full name again");
	String fullname = myobj.nextLine();
	
	if (fullname.equalsIgnoreCase(full_name))
	{
	System.out.println("Enter your full name successful");
	System.out.printf("%s\n",fullname);
	} 
	else
	{
	System.out.println("Try again!!");
	
	}

	String[] nameComponents = full_name.split(" ");
	
		
		for (String part : nameComponents) {
            System.out.println(part);
        }

	}
	
}
