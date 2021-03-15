package co.com.avianca.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.avianca.ui.FilterFlightAviancaPage.DAY_MONTH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectReturn implements Task {

    private final String day;
    private final String month;

    public SelectReturn(String date) {
        String[] dateTrip = date.split("-");
        day = dateTrip[0];
        month = dateTrip[1];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DAY_MONTH.of(month, day))
        );
    }

    public static SelectReturn date(String dateReturn) {
        return instrumented(SelectReturn.class, dateReturn);
    }
}
