package co.com.choucair.certification.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class HomePage {
    public static final Target OPTION_SIGN_IN = Target.the("Opccion para ingresar al formulario de crear cuenta")
            .located(By.xpath("//*[@title='Log in to your customer account']"));

}
