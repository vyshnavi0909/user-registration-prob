import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    //uc1-first-name
    static String firstNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:(start with cap and minimum 3 characters)");
        String fName = scan.nextLine();
        return fName;
    }
    public static void main(String[] args) {
        boolean res = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        System.out.println(res);
        while(res == false){
            System.out.println("Try again!");
            res = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        }
    }
}
