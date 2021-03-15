package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ContactPage {

    public static final Target INPUT_EMAIL_CONTACT =
            Target.the("input email contact")
                    .locatedBy("(//input[@formcontrolname='email' and @placeholder='Correo'])[1]");
    public static final Target INPUT_TELEPHONE_CONTACT =
            Target.the("input telephone contact")
                    .locatedBy("(//input[@formcontrolname='number' and @placeholder='Número de teléfono'])[1]");
    public static final Target BTN_SAVE_CONTINUE =
            Target.the("button save and continue")
                    .locatedBy("(//button[contains(text(),'Guardar y continuar')])[1]");

}
