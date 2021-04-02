/* import org.junit.Assert; */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitAssertion {
    @Test
    void first_Name_Validation_When_Correct_Return_Happy(){
        UserValidator firstName = new UserValidator();
        String resFName = firstName.firstNameCheck("Vyshnavi");
        Assertions.assertEquals("HAPPY",resFName);
        System.out.println(resFName);
    }
    @Test
    void first_Name_Validation_When_Fails_Return_Sad(){
        UserValidator firstName = new UserValidator();
        String resFName = firstName.firstNameCheck("vyshnavi");
        Assertions.assertEquals("SAD",resFName);
        System.out.println(resFName);
    }
    @Test
    void last_Name_Validation_When_Correct_Return_Happy(){
        UserValidator lastName = new UserValidator();
        String resLName = lastName.lastNameCheck("Babbur");
        Assertions.assertEquals("HAPPY", resLName);
        System.out.println(resLName);
    }
    @Test
    void last_Name_Validation_When_Fails_Return_Sad(){
        UserValidator lastName = new UserValidator();
        String resLName = lastName.lastNameCheck("babbur");
        Assertions.assertEquals("SAD", resLName);
        System.out.println(resLName);
    }
    @Test
    void email_Validation_When_Correct_Return_Happy(){
        UserValidator email = new UserValidator();
        String resEmail = email.emailCheck("abc.sss@bl.co.la");
        Assertions.assertEquals("HAPPY", resEmail);
        System.out.println(resEmail);
    }
    @Test
    void email_Validation_When_Fails_Return_Sad(){
        UserValidator email = new UserValidator();
        String resEmail = email.emailCheck("aba.sss@bl.cl.la");
        Assertions.assertEquals("SAD", resEmail);
        System.out.println(resEmail);
    }
    @Test
    void mobile_Validation_When_Correct_Return_Happy() {
        UserValidator mobNum = new UserValidator();
        String resPhNum = mobNum.mobileNumberCheck("+91 7200220022");
        Assertions.assertEquals("HAPPY", resPhNum);
        System.out.println(resPhNum);
    }
    @Test
    void mobile_Validation_When_Fails_Return_Sad() {
        UserValidator mobNum = new UserValidator();
        String resPhNum = mobNum.mobileNumberCheck("+91 2200220022");
        Assertions.assertEquals("SAD", resPhNum);
        System.out.println(resPhNum);
    }
    @Test
    void password_Validation_When_Correct_Return_Happy(){
        UserValidator password = new UserValidator();
        String resPassword = password.passwordCheck("BDS1@dsfd");
        Assertions.assertEquals("HAPPY", resPassword);
        System.out.println(resPassword);
    }
    @Test
    void password_Validation_When_Fails_Return_Sad(){
        UserValidator password = new UserValidator();
        String resPassword = password.passwordCheck("BDSdsfd");
        Assertions.assertEquals("SAD", resPassword);
        System.out.println(resPassword);
    }
}
