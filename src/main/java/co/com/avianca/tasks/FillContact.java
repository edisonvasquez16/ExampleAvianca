package co.com.avianca.tasks;

import co.com.avianca.models.FlightsModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.avianca.ui.ContactPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillContact implements Task {

    private final FlightsModel flights;

    public FillContact(FlightsModel flights) {
        this.flights = flights;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(flights.getEmail()).into(INPUT_EMAIL_CONTACT),
                Enter.theValue(flights.getTelephone()).into(INPUT_TELEPHONE_CONTACT),
                Scroll.to(BTN_SAVE_CONTINUE),
                Click.on(BTN_SAVE_CONTINUE)
        );
    }

    public static FillContact withData(FlightsModel flight) {
        return instrumented(FillContact.class, flight);
    }
}
