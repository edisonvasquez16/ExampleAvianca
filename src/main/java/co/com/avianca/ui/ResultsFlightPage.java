package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsFlightPage {

    public static final Target LBL_TITLE_PAGE =
            Target.the("lbl title page")
                    .locatedBy("//h1[contains(text(),'Selecciona tu vuelo de')]");
    public static final Target BTN_SELECT_FLIGHT =
            Target.the("button select flight")
                    .locatedBy("(//avail-list-pres/expander-elem[{0}]//div[@class='recap-price']//button)[1]");
    public static final Target BTN_CONTINUE =
            Target.the("button continue")
                    .located(By.id("continue-btn-footer-static"));

}
