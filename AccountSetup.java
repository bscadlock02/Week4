import java.util.*;
public class AccountSetup {
    public static void main(String[] args) 
    {
        int fullname;
        int password; 

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fullname:");
        fullname = input.nextInt();
        System.out.println("Enter your password:");
        password = input.nextInt();
    
        String fullname = "Mrs. Karen Connell";
        String password = "Javarocks";
        
        System.out.println("Your Full name is: " + fullname);
        System.out.println("Your password is: " + password);
    }
 }