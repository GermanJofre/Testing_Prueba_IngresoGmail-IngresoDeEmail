package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.loginExitosoConstants;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class loginExitosoServices extends ActionManager {

    public static void mainpage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void buscargmail(String text){
        setInput(loginExitosoConstants.ACCEDER,text);
    }

    public static void accedergmail(String text){
        click(loginExitosoConstants.ACCEDER,text);
    }

    public static void ingresarlogin(String text){
        click(loginExitosoConstants.ACCEDER,text);
    }

    public static void datos(String correo, String contrasena) {
        setInput(loginExitosoConstants.CORREO,correo + Keys.ENTER);
        setInput(loginExitosoConstants.CORREO,contrasena + Keys.ENTER);
    }

    public static void resultados(){
        waitPresence(loginExitosoConstants.RESULTADO);
        Assert.assertTrue(WebActionManager.getElement(loginExitosoConstants.RESULTADO).isDisplayed());
    }

}
