package co.com.avianca.tasks;

import co.com.avianca.models.FlightsModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.avianca.ui.AddPersonsPage.BTN_ADD_PERSONS;
import static co.com.avianca.ui.FilterFlightAviancaPage.*;
import static co.com.avianca.ui.GeneralsObjectPage.BUTTON_ACCEPT_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlight implements Task {

    private final FlightsModel flight;

    public SearchFlight(FlightsModel flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TAB_FLIGHT_RESERVE),
                Enter.theValue(flight.getFrom()).into(INPUT_FROM),
                Click.on(OPTION_CATALOGS.of(flight.getFrom())),
                Enter.theValue(flight.getDestination()).into(INPUT_DESTINATION),
                Click.on(OPTION_CATALOGS.of(flight.getDestination())),
                Click.on(INPUT_DATE_TRIP),
                SelectTrip.date(flight.getDateTrip()),
                SelectReturn.date(flight.getDateReturn()),
                Click.on(INPUT_PERSONS),
                Click.on(BTN_CLASS_TRIP.of(flight.getClassTrip()))
        );
        flight.getPersons().forEach(
                person -> actor.attemptsTo(
                        AddPersons.forFlight(person)
                )
        );
        actor.attemptsTo(
                Click.on(BTN_ADD_PERSONS),
                Click.on(BTN_SEARCH_FLIGHT)
        );
        if(Visibility.of(BUTTON_ACCEPT_MESSAGE).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(BUTTON_ACCEPT_MESSAGE));
    }

    public static SearchFlight withData(FlightsModel flight) {
        return instrumented(SearchFlight.class, flight);
    }

}
