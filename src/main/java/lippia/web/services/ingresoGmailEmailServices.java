package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class loginExitosoServices extends ActionManager {

    public static void mainpage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void buscargmail(String text){
        setInput(loginExitosoConstants.BUSCAR,text);
        click(loginExitosoConstants.BUSQUEDA);
        click(loginExitosoConstants.ACCEDERGMAIL);
    }

    public static void accedergmail(){
        Assert.assertTrue(WebActionManager.getElement(loginExitosoConstants.GMAIL).isDisplayed());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void ingresarlogin(){
        click(loginExitosoConstants.INGRESAR);
    }

    public static void datousuario(String correo) {
        setInput(loginExitosoConstants.CORREO,correo);
    }

    public static void ingresodecorreo(){
        Assert.assertTrue(WebActionManager.getElement(loginExitosoConstants.RESULTADO).isDisplayed());
    }

}
