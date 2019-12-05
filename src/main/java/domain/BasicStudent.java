package domain;

import json.*;

/**
 * Created by Andrii_Rodionov on 1/5/2017.
 */
public class BasicStudent implements Jsonable {

    protected String name;
    protected String surname;
    protected Integer year;

    public BasicStudent() {
    }

    public BasicStudent(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public JsonObject toJsonObject() {
        JsonPair name = new JsonPair("name", new JsonString(this.name));
        JsonPair surname = new JsonPair("surname", new JsonString(this.surname));
        JsonPair year = new JsonPair("year", new JsonNumber(this.year));
        JsonObject all =new JsonObject(name, surname, year);
        return all;
    }

}

