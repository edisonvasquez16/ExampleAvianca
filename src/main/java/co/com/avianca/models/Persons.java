package co.com.avianca.models;

import lombok.Data;

import java.util.List;

@Data
public class Persons {

    private String personType;
    private int number;
    private List<Detail> detail;

}
