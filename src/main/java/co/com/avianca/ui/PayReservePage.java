package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PayReservePage {

    public static final Target BTN_KEEP_RESERVE =
            Target.the("button reserve")
                    .locatedBy("//button[@aria-label='Botón de reserva' and contains(text(),'Mantener reserva')]");
    public static final Target LBL_TITLE_KEEP_RESERVE =
            Target.the("title keep reserve")
                    .locatedBy("//h2[@class='time-to-think-title']");

}
