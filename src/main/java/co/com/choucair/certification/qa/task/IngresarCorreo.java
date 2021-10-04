package co.com.choucair.certification.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.qa.userinterface.HomePage.*;
import static co.com.choucair.certification.qa.userinterface.FormPage.*;

public class IngresarCorreo implements Task {
    private String strEmail;

    public IngresarCorreo(String strEmail) {
        this.strEmail = strEmail;
    }

    public static IngresarCorreo con(String strEmail) {
        return Tasks.instrumented(IngresarCorreo.class,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_SIGN_IN),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
                Click.on(BUTTON_CREATE)
        );
    }
}
