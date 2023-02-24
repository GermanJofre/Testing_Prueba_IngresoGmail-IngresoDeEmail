package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ingresoGmailEmailServices;

public class ingresoGmailEmailSteps extends PageSteps {

    @Given("Como usuario estoy en el buscador de Google")
    public void mainpage() {
        ingresoGmailEmailServices.mainpage();
    }

    @When("^Como usuario busco (.*) en el buscador$")
    public void buscargmail(String gmail) {
        ingresoGmailEmailServices.buscargmail(gmail);
    }

    @Then("Como usuario ingreso a la pagina de gmail")
    public void ingresoagmail() {
        ingresoGmailEmailServices.accedergmail();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    @Given("^Como usuario ingrese a (.*) atreves del buscador$")
    public void ingresogmail(String gmail) {
        ingresoGmailEmailServices.mainpage();
        ingresoGmailEmailServices.buscargmail(gmail);
    }

    @When("Como usuario ingreso para logearme")
    public void ingresarlogin() {
        ingresoGmailEmailServices.ingresarlogin();
    }

    @And("^Como usuario ingreso mi (.*)")
    public void datousuario(String correo) {
        ingresoGmailEmailServices.datousuario(correo);
    }


    @Then("Como usuario verifico que aparezca el boton siguiente")
    public void ingresodecorreo() {
        ingresoGmailEmailServices.ingresodecorreo();
    }

}
