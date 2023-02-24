package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ingresoGmailEmailConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ingresoGmailEmailServices extends ActionManager {

    public static void mainpage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void buscargmail(String text){
        setInput(ingresoGmailEmailConstants.BUSCAR,text);
        click(ingresoGmailEmailConstants.BUSQUEDA);
        click(ingresoGmailEmailConstants.ACCEDERGMAIL);
    }

    public static void accedergmail(){
        Assert.assertTrue(WebActionManager.getElement(ingresoGmailEmailConstants.GMAIL).isDisplayed());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void ingresarlogin(){
        click(ingresoGmailEmailConstants.INGRESAR);
    }

    public static void datousuario(String correo) {
        setInput(ingresoGmailEmailConstants.CORREO,correo);
    }

    public static void ingresodecorreo(){
        Assert.assertTrue(WebActionManager.getElement(ingresoGmailEmailConstants.RESULTADO).isDisplayed());
    }

}
