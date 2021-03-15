package co.com.avianca.models;

import lombok.Data;

import java.util.List;

@Data
public class FlightsModel {

    private String code;
    private String from;
    private String flightSelect;
    private String destination;
    private String dateTrip;
    private String dateReturn;
    private String classTrip;
    private String email;
    private String telephone;
    private List<Persons> persons;

}
