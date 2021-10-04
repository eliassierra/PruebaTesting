package co.com.choucair.certification.qa.task;

import co.com.choucair.certification.qa.userinterface.OpenThePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePage implements Task {
    private OpenThePageUI openThePage;


    public static OpenThePage with() {
        return Tasks.instrumented(OpenThePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openThePage));
    }
}
