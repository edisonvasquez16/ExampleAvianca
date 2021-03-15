package co.com.avianca.tasks;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.avianca.ui.ResultsFlightPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFlight implements Task {

    private final String flight;

    public SelectFlight(String flight) {
        this.flight = flight;
    }

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBL_TITLE_PAGE),
                Click.on(BTN_SELECT_FLIGHT.of(flight)),
                Click.on(BTN_CONTINUE));
        Thread.sleep(1000);
        actor.attemptsTo(
                Scroll.to(LBL_TITLE_PAGE),
                Click.on(BTN_SELECT_FLIGHT.of(flight)),
                Click.on(BTN_CONTINUE)
        );
    }

    public static SelectFlight number(String flight) {
        return instrumented(SelectFlight.class, flight);
    }
}
