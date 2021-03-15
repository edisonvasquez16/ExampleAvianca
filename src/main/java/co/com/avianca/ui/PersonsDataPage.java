package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PersonsDataPage {

    public static final Target INPUT_NAME =
            Target.the("input name")
                    .locatedBy("(//input[@autocomplete='given-name' and @placeholder='Nombre'])[1]");
    public static final Target INPUT_FAMILY_NAME =
            Target.the("input family name")
                    .locatedBy("(//input[@autocomplete='family-name' and @placeholder='Apellido'])[1]");
    public static final Target INPUT_BDAY_DAY =
            Target.the("input birthday day")
                    .locatedBy("(//input[@name='bday-day' and @placeholder='Día'])[1]");
    public static final Target SELECT_BDAY_MONTH =
            Target.the("select birthday motn")
                    .locatedBy("(//mat-select[@aria-label='Mes'])[1]");
    public static final Target OPTION_BDAY_MONTH =
            Target.the("option birthday month")
                    .locatedBy("//span[@class='mat-option-text' and contains(text(),'{0}')]");
    public static final Target INPUT_BDAY_YEAR =
            Target.the("input birthday year")
                    .locatedBy("(//input[@name='bday-year' and @placeholder='Año'])[1]");
    public static final Target BTN_NEXT_PERSON =
            Target.the("button next person")
                    .locatedBy("(//button[contains(text(),'Próximo Pasajero')])[1]");
    public static final Target BTN_CONTACT_INFO =
            Target.the("button contact info")
                    .locatedBy("(//button[contains(text(),'Información de Contacto')])[1]");

}
