package co.com.avianca.tasks;

import co.com.avianca.utils.GetNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.avianca.ui.FilterFlightAviancaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetMonths implements Task {

    private final String month;

    public SetMonths(String month) {
        this.month = month;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] actualMonth = Text.of(LBL_FIRST_MONTH).viewedBy(actor).asString().split(" ");
        if (!actualMonth[0].equals(month)) {
            int dif = GetNumber.month(actualMonth[0]) - GetNumber.month(month);
            if (dif > 0) {
                for (int x = 0; x < dif; x++) {
                    actor.attemptsTo(
                            Click.on(NEXT_MONTH)
                    );
                }
            } else {
                dif = dif * (-1);
                for (int x = 0; x < dif; x++) {
                    actor.attemptsTo(
                            Click.on(PREVIOUS_MONTH)
                    );
                }
            }
        }

    }

    public static SetMonths forDate(String month) {
        return instrumented(SetMonths.class, month);
    }
}
