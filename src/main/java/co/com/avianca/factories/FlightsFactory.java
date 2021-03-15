package co.com.avianca.factories;

import co.com.avianca.exceptions.NotFoundException;
import co.com.avianca.models.FlightsModel;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class FlightsFactory {

    private static final String FLIGHTS_JSON = "json/flights.json";

    public static FlightsModel getFlightByCode(String code) throws FileNotFoundException {
        return getFlights().stream()
                .filter(a -> a.getCode()
                .equals(code))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("Flight with code %s not found", code)));
    }

    public static List<FlightsModel> getFlights() throws FileNotFoundException {
        return Arrays.asList(from(getActorsFile()).getObject("flights", FlightsModel[].class));
    }

    private static URL getActorsFile() throws FileNotFoundException {
        String path = FLIGHTS_JSON;
        URL filePath = FlightsFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for actors: " + path);
        }
        return filePath;
    }
}
