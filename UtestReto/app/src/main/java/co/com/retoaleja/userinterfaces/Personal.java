package co.com.retoaleja.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {
    public static final Target FIRSTNAME=Target.the("firstname").
            locatedBy("//input[@id='firstName']");
    public static final Target LASTTNAME=Target.the("lastname").
            locatedBy("//input[@id='lastName']");
    public static final Target EMAIL=Target.the("firstname").
            locatedBy("//input[@id='email']");
    public static final Target MONTH=Target.the("firstname").
            locatedBy("//select[@id='birthMonth']");
    public static final Target DAY=Target.the("lastname").
            locatedBy("//select[@id='birthDay']");
    public static final Target YEAR=Target.the("firstname").
            locatedBy("//select[@id='birthYear']");
    public static final Target BUTTONEXT =Target.the("butonnext").
            locatedBy("//span[normalize-space()='Next: Location']");

}
