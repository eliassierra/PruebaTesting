package co.com.choucair.certification.qa.task;

import co.com.choucair.certification.qa.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.qa.userinterface.FormPage.*;

public class DiligenciarInformacion implements Task {
    private User user;

    public DiligenciarInformacion(User user) {
        this.user = user;
    }

    public static DiligenciarInformacion enFormulario(User user) {
        return Tasks.instrumented(DiligenciarInformacion.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(user.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD)
        );
    }
}
