package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.loginExitosoServices;

public class loginExitosoSteps extends PageSteps {

    @Given("Como usuario estoy en el buscador de Google")
    public void mainpage() {
        loginExitosoServices.mainpage();
    }

    @When("^Como usuario busco (.*) en el buscador$")
    public void buscargmail(String gmail) {
        loginExitosoServices.buscargmail(gmail);
    }

    @And("Como usuario ingreso a la pagina gmail")
    public void accedergmail() {
        loginExitosoServices.accedergmail();
    }

    @And("Como usuario quiero logearme")
    public void ingresarlogin() {
        loginExitosoServices.ingresarlogin();
    }

    @And("^Como usuario ingreso mi (.*) y (.*)$")
    public void datos(String correo,String contrasena) {
        loginExitosoServices.datos(correo, contrasena);
    }

    @Then("Como usuario puedo ingresar a mi correo")
    public void resultado() {
        loginExitosoServices.resultados();
    }

}
