import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitAssertion {
    @Test
    void first_Name_Validation_When_Correct_Return_Happy(){
        UserValidator firstName = new UserValidator();
        String resFName = null;
        try {
            resFName = firstName.firstNameCheck("Vyshnavi");
            Assertions.assertEquals("HAPPY",resFName);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resFName);
    }

    @Test
    void first_Name_Validation_When_Fails_Return_Sad(){
        UserValidator firstName = new UserValidator();
        String resFName = null;
        try {
            resFName = firstName.firstNameCheck("vyshnavi");
            Assertions.assertEquals("SAD",resFName);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resFName);
    }

    @Test
    void last_Name_Validation_When_Correct_Return_Happy(){
        UserValidator lastName = new UserValidator();
        String resLName = null;
        try {
            resLName = lastName.lastNameCheck("Babbur");
            Assertions.assertEquals("HAPPY", resLName);
        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resLName);
    }

    @Test
    void last_Name_Validation_When_Fails_Return_Sad(){
        UserValidator lastName = new UserValidator();
        String resLName = null;
        try {
            resLName = lastName.lastNameCheck("babbur");
            Assertions.assertEquals("SAD", resLName);
        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resLName);
    }

    @Test
    void email_Validation_When_Correct_Return_Happy(){
        UserValidator email = new UserValidator();
        String resEmail = null;
        try {
            resEmail = email.emailCheck("abc.sss@bl.co.la");
            Assertions.assertEquals("HAPPY", resEmail);
        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resEmail);
    }

    @Test
    void email_Validation_When_Fails_Return_Sad(){
        UserValidator email = new UserValidator();
        String resEmail = null;
        try {
            resEmail = email.emailCheck("aba.sss@bl.cl.la");
            Assertions.assertEquals("SAD", resEmail);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resEmail);
    }

    @Test
    void mobile_Validation_When_Correct_Return_Happy() {
        UserValidator mobNum = new UserValidator();
        String resPhNum = null;
        try {
            resPhNum = mobNum.mobileNumberCheck("+91 7200220022");
            Assertions.assertEquals("HAPPY", resPhNum);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resPhNum);
    }

    @Test
    void mobile_Validation_When_Fails_Return_Sad() {
        UserValidator mobNum = new UserValidator();
        String resPhNum = null;
        try {
            resPhNum = mobNum.mobileNumberCheck("+91 2200220022");
            Assertions.assertEquals("SAD", resPhNum);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resPhNum);
    }

    @Test
    void password_Validation_When_Correct_Return_Happy(){
        UserValidator password = new UserValidator();
        String resPassword = null;
        try {
            resPassword = password.passwordCheck("BDS1@dsfd");
            Assertions.assertEquals("HAPPY", resPassword);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resPassword);
    }

    @Test
    void password_Validation_When_Fails_Return_Sad(){
        UserValidator password = new UserValidator();
        String resPassword = null;
        try {
            resPassword = password.passwordCheck("BDSdsfd");
            Assertions.assertEquals("SAD", resPassword);

        } catch (ValidationException e) {
            Assertions.assertEquals(ValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
        System.out.println(resPassword);
    }
}
