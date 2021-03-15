package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FilterFlightAviancaPage {

    public static final Target TAB_FLIGHT_RESERVE =
            Target.the("input from ")
                    .located(By.id("reservatuvuelo"));
    public static final Target INPUT_FROM =
            Target.the("input from ")
                    .locatedBy("(//label[contains(text(),'Desde')]/div/input[starts-with(@name,'pbOrigen') and @data-name='pbOrigen'])[1]");
    public static final Target INPUT_DESTINATION =
            Target.the("input destination")
                    .locatedBy("(//label[contains(text(),'Hacia')]/div/input[starts-with(@name,'pbDestino') and @data-name='pbDestino'])[1]");
    public static final Target OPTION_CATALOGS =
            Target.the("options catalogs")
                    .locatedBy("//div[@class='name']/b[contains(string(),'{0}')]");
    public static final Target LBL_FIRST_MONTH =
            Target.the("first month")
                    .locatedBy("(//div[@class='name-month'])[1]");
    public static final Target INPUT_DATE_TRIP =
            Target.the("input trip date")
                    .locatedBy("(//input[@name='pbFechaIda'])[1]");
    public static final Target DAY_MONTH =
            Target.the("day of month")
                    .locatedBy("(//div[@class='name-month' and contains(text(),'{0}')]/../..//div[@class='intern-day' and contains(text(),'{1}')])[1]");
    public static final Target PREVIOUS_MONTH =
            Target.the("button previous month")
                    .locatedBy("(//div[@aria-label='Mes anterior'])[1]");
    public static final Target NEXT_MONTH =
            Target.the("button next month")
                    .locatedBy("(//div[@aria-label='Mes siguiente'])[1]");
    public static final Target INPUT_PERSONS =
            Target.the("input persons")
                    .locatedBy("(//span[contains(text(),'Pasajeros y clase')]/../div/input[@name='pbPasajeros'])[2]");
    public static final Target BTN_CLASS_TRIP =
            Target.the("button class trip")
                    .locatedBy("//div[@class='passenger float']//input[@name='clase' and @type='radio' and @value='{0}']/..");
    public static final Target BTN_SEARCH_FLIGHT =
            Target.the("button search flight")
                    .locatedBy("(//button[@type='submit' and @title='Buscar vuelos'])[1]");


}
