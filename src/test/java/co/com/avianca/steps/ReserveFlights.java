package co.com.avianca.steps;

import co.com.avianca.factories.FlightsFactory;
import co.com.avianca.models.FlightsModel;
import co.com.avianca.navigation.OpenBrowser;
import co.com.avianca.questions.TextFound;
import co.com.avianca.tasks.FillContact;
import co.com.avianca.tasks.FillPersons;
import co.com.avianca.tasks.SearchFlight;
import co.com.avianca.tasks.SelectFlight;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import lombok.SneakyThrows;

import static co.com.avianca.ui.PayReservePage.BTN_KEEP_RESERVE;
import static co.com.avianca.ui.PayReservePage.LBL_TITLE_KEEP_RESERVE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;

public class ReserveFlights {

    @Dado("^que el usuario (.*) accede hasta la página de Avianca$")
    public void accessToAviancaPage(String name) {
        theActorCalled(name)
                .wasAbleTo(OpenBrowser.inAvianca());
    }

    @SneakyThrows
    @Cuando("^el selecciona los datos del vuelo (.*)$")
    public void reserveFlights(String code) {
        FlightsModel flight = FlightsFactory.getFlightByCode(code);
        theActorInTheSpotlight()
                .wasAbleTo(
                        SearchFlight.withData(flight),
                        SelectFlight.number(flight.getFlightSelect()),
                        FillPersons.data(flight.getPersons()),
                        FillContact.withData(flight)
                );
    }

    @Entonces("^el debería poder reservar el vuelo correctamente$")
    public void seeFlightsReserved() {
        theActorInTheSpotlight()
                .should(
                        seeThat(the(BTN_KEEP_RESERVE), isVisible()),
                        seeThat(TextFound.in(LBL_TITLE_KEEP_RESERVE), equalTo("¿Necesitas algo de tiempo para pensar? ¡No te preocupes!"))
                );
    }
}
