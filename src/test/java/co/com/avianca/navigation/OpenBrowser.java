package co.com.avianca.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenBrowser implements Task {

    @Override
    @Step("{0} abre el navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new Avianca()));
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static OpenBrowser inAvianca() {
        return instrumented(OpenBrowser.class);
    }
}
