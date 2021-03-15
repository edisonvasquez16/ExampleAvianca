package co.com.avianca.tasks;

import co.com.avianca.models.Persons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.avianca.ui.AddPersonsPage.*;
import static co.com.avianca.ui.FilterFlightAviancaPage.TAB_FLIGHT_RESERVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddPersons implements Task {

    private final Persons person;

    public AddPersons(Persons person) {
        this.person = person;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TAB_FLIGHT_RESERVE));
        Target objectAdd = null;
        switch (person.getPersonType()) {
            case "Adults":
                objectAdd = BTN_ADD_ADULT;
                person.setNumber(person.getNumber() - 1);
                break;
            case "Boys":
                objectAdd = BTN_ADD_BOYS;
                break;
            case "Babies":
                objectAdd = BTN_ADD_BABIES;
                break;
        }
        for (int x = 0; x < person.getNumber(); x++)
            actor.attemptsTo(Click.on(objectAdd));
    }

    public static AddPersons forFlight(Persons persons) {
        return instrumented(AddPersons.class, persons);
    }
}
