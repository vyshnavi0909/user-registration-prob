import java.util.Scanner;
import java.util.regex.Pattern;


interface Validation{
    
    boolean validate(String regEx, String input);

    static void printResult(String regEx, String input, String function, Validation fobj ){
        if(fobj.validate(regEx, input) == true){
            System.out.println(function + "-valid");
        }else{
            System.out.println(function + "-invalid");
        }
    }
}

public class LambdaValidation {
    

    static String inputCall(String userInput){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + userInput);
        String userInp = scan.nextLine();
        return userInp; 
    }
    public static void main(String[] args) {
        //lambda expression
        Validation inputCheck = (String regEx, String input) -> {
            boolean check= Pattern.matches(regEx,input);
            return check;
        };

        String fName = LambdaValidation.inputCall("First Name");
        String lName = LambdaValidation.inputCall("Last Name");
        String email = LambdaValidation.inputCall("Email");
        String mobileNum = LambdaValidation.inputCall("Mobile Number");
        String passWord = LambdaValidation.inputCall("Password");
        System.out.println("\n");

        Validation.printResult("^[A-Z]{1}[a-z]{2,}", fName, "First Name", inputCheck);
        Validation.printResult("^[A-Z]{1}[a-z]{2,}", lName, "Last Name", inputCheck);
        Validation.printResult("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", email, "Email", inputCheck);
        Validation.printResult("^[+91]+ [6-9]{1}[0-9]{9}", "+91 9700303344",mobileNum, inputCheck);
        Validation.printResult("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", passWord, "Password", inputCheck);
    }
}
