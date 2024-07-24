import java.util.Scanner;

public class question01_part5 
{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputString = myobj.nextLine();
        
        String trimmedString = inputString.trim();
        
        System.out.printf("Trimmed string: '%s'\n", trimmedString);
    }
}
