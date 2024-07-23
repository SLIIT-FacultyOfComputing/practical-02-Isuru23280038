import java.util.Scanner;

public class question01_part3 
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
	System.out.println("Enter your full name succesful!");
	System.out.printf("%s\n",fullname);
	} 
	else
	{
	System.out.println("Try again!!");
	}

    String modifiedFullName = (firstname + " " + middlename + " " + lastname);
    modifiedFullName = modifiedFullName.replace('a', '@').replace('e', '3');
    modifiedFullName = modifiedFullName.toUpperCase();

    System.out.printf("Modified Full Name: %s\n",modifiedFullName);
	}
}
