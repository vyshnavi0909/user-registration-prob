import java.util.regex.Pattern;
public class UserValidator {

    static String firstNameCheck(String a){
        boolean name = Pattern.matches("^[A-Z]{1}[a-z]{2,}", a);
        if( name == true){
            return "HAPPY";
        }else {
            return "SAD";
        }
    }

    static String lastNameCheck(String b){
        boolean lName = Pattern.matches("^[A-Z]{1}[a-z]{2,}", b);
        if( lName == true){
            return "HAPPY";
        }else {
            return "SAD";
        }
    }

    static String emailCheck(String c){
        boolean email = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", c);
        if( email == true){
            return "HAPPY";
        }else {
            return "SAD";
        }
    }


    static String mobileNumberCheck(String d){
        boolean mobNumber = Pattern.matches("^[+91]+ [6-9]{1}[0-9]{9}", d);
        if( mobNumber == true){
            return "HAPPY";
        }else {
            return "SAD";
        }
    }

    static String passwordCheck(String e) {
        boolean password = Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", e);
        if (password == true) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }

	static boolean emailSamplesCheck(String a){
        boolean resEmail = Pattern.matches("^(?!\\.)[a-zA-Z0-9]+([.+_-]?[0-9])*@[A-Za-z0-9]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$",a);
        return resEmail;
    }
}
