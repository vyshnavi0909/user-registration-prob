import java.util.Scanner;
import java.util.regex.*;


public class UserRegistration {

	static String fName;
	static String lName;
    static String email;
    static String mobileNum;
    static String password;

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

    //uc4-mobile-phone
    static String mobileNumCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter mobile number:\n(country code(91) follow by space and 10 digit mobile number)\n");
        mobileNum = scan.nextLine();
        return mobileNum;
    }

    //uc5-password-minimum8
    static String passwordCheck(){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter password:\n(minimum 8 characters\natleast one upper case\natleast one numeric\n exactly one special character)\n");
        password = scan.nextLine();
        return password;
    }

    //main method
    public static void main(String[] args) {

		//first name check using regEx

        boolean res1 = Pattern.matches("^[A-Z]{1}[a-z]{2,}", UserRegistration.firstNameCheck());
        System.out.println(res1);

		// if false then try again
        while(res1 == false){
            System.out.println("Try again!");
            res1 = Pattern.matches("^[A-Z]{1}[a-z]{2,}", UserRegistration.firstNameCheck());

        }

		//last name check using regEx
        boolean res2 = Pattern.matches("^[A-Z]{1}[a-z]{2,}", UserRegistration.lastNameCheck());
        System.out.println(res2);

		//if false then try again
        while(res2 == false){
            System.out.println("\nTry again!");
            res2 = Pattern.matches("^[A-Z]{1}[a-z]{2,}", UserRegistration.lastNameCheck());
        }

        //email check using regEx
        boolean res3 = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", UserRegistration.emailCheck());
        System.out.println(res3);

        //if false trying again
        while(res3 == false){
            System.out.println("\nTry again!");
            res3 = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", UserRegistration.emailCheck());
        }

        //mobile number check using regEx
        boolean res4 = Pattern.matches("^[+91]+ [6-9]{1}[0-9]{9}", UserRegistration.mobileNumCheck());
        System.out.println(res4);

        //if false
        while(res4 == false){
            System.out.println("\nTry again!");
            res4 = Pattern.matches("^[+91]+ [6-9]{1}[0-9]{9}", UserRegistration.mobileNumCheck());
        }

        //password check using regEx

        boolean res5 = Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", UserRegistration.passwordCheck());
        System.out.println(res5);
    
        //if false
        while(res5 == false){
            System.out.println("\nTry again!");
            res5 = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", UserRegistration.passwordCheck());
        }

      

		//print statements
		System.out.println("\nFirst Name: " + fName);
        System.out.println("\nLast Name: " + lName);
        System.out.println("\nEmail: " + email);
        System.out.println("\nMobile number: " + mobileNum);
    }
}
