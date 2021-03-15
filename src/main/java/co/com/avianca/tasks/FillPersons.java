package co.com.avianca.tasks;

import co.com.avianca.models.Detail;
import co.com.avianca.models.Persons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;

import static co.com.avianca.ui.PersonsDataPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPersons implements Task {

    private final List<Persons> persons;

    public FillPersons(List<Persons> persons) {
        this.persons = persons;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //int x = 0;
        for (Persons person : persons) {
            for (Detail detail : person.getDetail()) {
                actor.attemptsTo(
                        Enter.theValue(detail.getName()).into(INPUT_NAME),
                        Enter.theValue(detail.getLastName()).into(INPUT_FAMILY_NAME)
                );
                if (Visibility.of(SELECT_BDAY_MONTH).viewedBy(actor).asBoolean()) {
                    actor.attemptsTo(
                            Enter.theValue(detail.getBirthdayDay()).into(INPUT_BDAY_DAY),
                            Click.on(SELECT_BDAY_MONTH),
                            Click.on(OPTION_BDAY_MONTH.of(detail.getBirthdayMonth())),
                            Enter.theValue(detail.getBirthdayYear()).into(INPUT_BDAY_YEAR)
                    );
                }
                if (Visibility.of(BTN_NEXT_PERSON).viewedBy(actor).asBoolean())
                    actor.attemptsTo(
                            Scroll.to(BTN_NEXT_PERSON),
                            Click.on(BTN_NEXT_PERSON)
                    );
                //x = x + 1;
            }

        }
        actor.attemptsTo(
                Scroll.to(BTN_CONTACT_INFO),
                Click.on(BTN_CONTACT_INFO));
    }

    public static FillPersons data(List<Persons> persons) {
        return instrumented(FillPersons.class, persons);
    }
}
