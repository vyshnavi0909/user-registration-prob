import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    //uc1-first-name
    static String firstNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fName = scan.nextLine();
        return fName;
    }
    
    //uc2-last-name
    static String lastNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last name:");
        String lName = scan.nextLine();
        return lName;
    }
    

    
    public static void main(String[] args) {
        boolean res1 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        System.out.println(res1);
        boolean res2 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.lastNameCheck());
        System.out.println(res2);
        
    }
}