package co.com.choucair.certification.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target INPUT_EMAIL = Target.the("").located(By.id("email_create"));
    public static final Target BUTTON_CREATE = Target.the("").located(By.id("SubmitCreate"));
    public static final Target INPUT_FIRST_NAME = Target.the("").located(By.id("customer_firstname"));
    public static final Target INPUT_LAST_NAME = Target.the("").located(By.id("customer_lastname"));
    public static final Target INPUT_PASSWORD = Target.the("").located(By.id("passwd"));
    public static final Target INPUT_DAY = Target.the("").located(By.id("days"));


}
