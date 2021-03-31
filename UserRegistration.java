import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	 static String fName;
	 static String lName;

    //uc1-first-name
    static String firstNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:\n(start with cap and minimum 3 characters)");
        fName = scan.nextLine();
        return fName;
    }

    //uc2-last-name
    static String lastNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last name:\n(start with cap and minimum 3 characters)");
        lName = scan.nextLine();
        return lName;
    }

	 //main method
    public static void main(String[] args) {

		  //checking first name
        boolean res1 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        System.out.println(res1);

		  //if res1-false then try again
        while(res1 == false){
            System.out.println("Try again!");
            res1 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        }

		  //chekcing last name
        boolean res2 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.lastNameCheck());
        System.out.println(res2);

		  //if res2-false then try again
        while(res2 == false){
            System.out.println("Try again!");
            res2 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.lastNameCheck());
        }

		  //print statements
		  System.out.println("First Name: " + fName);
        System.out.println("Last Name: " + lName);
    }
}
