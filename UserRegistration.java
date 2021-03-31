import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;
	static String lName;
    static String email;

    //uc1-first-name
    static String firstNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter first name:(start with cap and minimum 3 characters)\n");
        fName = scan.nextLine();
        return fName;
    }

    //uc2-last-name
    static String lastNameCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter last name:\n(start with cap and minimum 3 characters)\n");
        lName = scan.nextLine();
        return lName;
    }

    //uc3-email
    static String emailCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter email id:\n(E.g. abc.xyz@bl.co.in\n(abc, bl & co are manditory) and  \n(xyz & in are optional) with precise @ and . positions)\n");
        email = scan.nextLine();
        return email;
    }

	//main method
    public static void main(String[] args) {

		//checking first name
        boolean res1 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        System.out.println(res1);

		// if false then try again
        while(res1 == false){
            System.out.println("Try again!");
            res1 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.firstNameCheck());
        }

		//chekcing last name
        boolean res2 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.lastNameCheck());
        System.out.println(res2);

		//if false then try again
        while(res2 == false){
            System.out.println("\nTry again!");
            res2 = Pattern.matches("^[A-Z]{1}[a-z]{2}[a-z]*", UserRegistration.lastNameCheck());
        }

        //email check
        boolean res3 = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", UserRegistration.emailCheck());
        System.out.println(res3);

        //if false trying again
        while(res3 == false){
            System.out.println("\nTry again!");
            res3 = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", UserRegistration.emailCheck());
        }

		//print statements
		System.out.println("\nFirst Name: " + fName);
        System.out.println("\nLast Name: " + lName);
        System.out.println("\nEmail: " + email);
    }
}
