package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class GeneralsObjectPage {

    public static final Target BUTTON_ACCEPT_MESSAGE =
            Target.the("button accept message")
                    .locatedBy("//div[@id='modal-warning']//button[contains(text(),'Continuar')]");

}
