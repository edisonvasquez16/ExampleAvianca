package co.com.avianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.avianca.ui.FilterFlightAviancaPage.DAY_MONTH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTrip implements Task {

    private final String day;
    private final String month;

    public SelectTrip(String date) {
        String[] dateTrip = date.split("-");
        day = dateTrip[0];
        month = dateTrip[1];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SetMonths.forDate(month),
                Click.on(DAY_MONTH.of(month, day))
        );
    }

    public static SelectTrip date(String dateTrip) {
        return instrumented(SelectTrip.class, dateTrip);
    }
}
