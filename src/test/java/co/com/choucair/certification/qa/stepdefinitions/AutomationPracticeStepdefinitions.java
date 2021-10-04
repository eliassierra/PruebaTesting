package co.com.choucair.certification.qa.stepdefinitions;

import co.com.choucair.certification.qa.model.User;
import co.com.choucair.certification.qa.task.DiligenciarInformacion;
import co.com.choucair.certification.qa.task.IngresarCorreo;
import co.com.choucair.certification.qa.task.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationPracticeStepdefinitions {
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa a la pagina web$")
    public void userIngresaALaPaginaWeb(String strNameActor) throws Exception {
        theActorCalled(strNameActor).wasAbleTo(OpenThePage.with());
    }

    @Given("^ingresar correo$")
    public void ingresarCorreo(List<String> strEmail) throws Exception {
        theActorInTheSpotlight().attemptsTo(IngresarCorreo.con(strEmail.get(0)));
    }

    @When("^Diliencio el formulario de creacion de cuenta$")
    public void diliencioElFormularioDeCreacionDeCuenta(List<User> lisUser) throws Exception {
        theActorInTheSpotlight().attemptsTo(DiligenciarInformacion.enFormulario(lisUser.get(0)));
    }

    @Then("^se crea la cuenta satisfactoriamente$")
    public void seCreaLaCuentaSatisfactoriamente() throws Exception {

    }
}
