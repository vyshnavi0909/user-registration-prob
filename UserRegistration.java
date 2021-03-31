import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    //uc1-first-name
    static String firstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fName = scan.nextLine();
        return fName;
    }
    public static void main(String[] args) {
        boolean res = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstName());
        System.out.println(res);
    }
}