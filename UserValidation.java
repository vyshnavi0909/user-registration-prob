import java.util.regex.Pattern;
public class UserValidation {

    static String firstNameCheck(String a) throws ValidationException{
        boolean name = Pattern.matches("^[A-Z]{1}[a-z]{2,}", a);
        try {
            if (a.length() == 0){
                throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Passed first name is invalid");
            }
            if( name == true){
                return "HAPPY";
            }else {
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ValidationException(ValidationException.ExceptionType.ENTERED_NULL, "Passed first name is invalid");
        }

    }

    static String lastNameCheck(String b) throws ValidationException{
        boolean lName = Pattern.matches("^[A-Z]{1}[a-z]{2,}", b);
        try {
            if (b.length() == 0){
                throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Passed first name is invalid");
            }
            if( lName == true){
                return "HAPPY";
            }else {
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ValidationException(ValidationException.ExceptionType.ENTERED_NULL, "Passed first name is invalid");
        }

    }

    static String emailCheck(String c) throws ValidationException{
        boolean email = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}", c);
        try {
            if (c.length() == 0){
                throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Passed email is invalid");
            }
            if( email == true){
                return "HAPPY";
            }else {
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ValidationException(ValidationException.ExceptionType.ENTERED_NULL, "Passed email is invalid");
        }

    }


    static String mobileNumberCheck(String d) throws ValidationException{
        boolean mobNumber = Pattern.matches("^[+91]+ [6-9]{1}[0-9]{9}", d);
        try {
            if (d.length() == 0){
                throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Passed email is invalid");
            }
            if( mobNumber == true){
                return "HAPPY";
            }else {
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ValidationException(ValidationException.ExceptionType.ENTERED_NULL, "Passed email is invalid");
        }

    }

    static String passwordCheck(String e) throws ValidationException{
        boolean password = Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", e);
        try {
            if (e.length() == 0){
                throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Passed email is invalid");
            }
            if (password == true) {
                return "HAPPY";
            }else {
                return "SAD";
            }
        }catch (NullPointerException w){
            throw new ValidationException(ValidationException.ExceptionType.ENTERED_NULL, "Passed email is invalid");
        }

    }


    static boolean emailSamplesCheck(String a){
        boolean resEmail = Pattern.matches("^(?!\\.)[a-zA-Z0-9]+([.+_-]?[0-9])*@[A-Za-z0-9]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$",a);
        return resEmail;
    }
}
