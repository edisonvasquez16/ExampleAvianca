package co.com.avianca.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AddPersonsPage {

    public static final Target BTN_MINUS_ADULT =
            Target.the("minus adults button")
                    .locatedBy("(//div[@title='Adultos']/../..//div[@class='minus control' and @role='button'])[2]");
    public static final Target BTN_ADD_ADULT =
            Target.the("add adult button")
                    .locatedBy("(//div[@title='Adultos']/../..//div[@class='plus control' and @role='button'])[2]");
    public static final Target BTN_MINUS_BOYS =
            Target.the("minus boys button")
                    .locatedBy("(//div[@title='Niños']/../..//div[@class='minus control' and @role='button'])[2]");
    public static final Target BTN_ADD_BOYS =
            Target.the("add boys button")
                    .locatedBy("(//div[@title='Niños']/../..//div[@class='plus control' and @role='button'])[2]");
    public static final Target BTN_MINUS_BABIES =
            Target.the("minus babies button")
                    .locatedBy("(//div[@title='Bebés']/../..//div[@class='minus control' and @role='button'])[2]");
    public static final Target BTN_ADD_BABIES =
            Target.the("add babies button")
                    .locatedBy("(//div[@title='Bebés']/../..//div[@class='plus control' and @role='button'])[2]");
    public static final Target BTN_ADD_PERSONS =
            Target.the("add persons")
                    .locatedBy("(//button[@class='btn btn-secondary secondary close-me'])[1]");


}
