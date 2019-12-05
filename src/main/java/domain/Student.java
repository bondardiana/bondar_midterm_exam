package domain;

import json.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class Student extends BasicStudent {

    private static final int min_pass = 3;

    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        // ToDo
    }

    public JsonObject toJsonObject() {
        // ToDo
        return null;
    }
}
