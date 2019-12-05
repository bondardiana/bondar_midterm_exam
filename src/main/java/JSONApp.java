import domain.BasicStudent;
import domain.Student;
import json.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JSONApp {
    public static void main(String[] args) {
        Json jYear = new JsonNumber(2);
        print(jYear); // 2

        Json jMarks = new JsonArray(new JsonNumber(3), new JsonNumber(4));
        print(jMarks); // [3, 4]

        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair marks = new JsonPair("marks", jMarks);
        JsonPair year = new JsonPair("year", jYear);
        JsonObject jsonObj = new JsonObject(name, surname, year, marks);
        print(jsonObj); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}

        print(jsonObj.projection("surname", "age", "year", "marks")); // {'surname': 'Rodionov', 'year': 2, 'marks': [3, 4]}

        BasicStudent basicStudent = new BasicStudent("Andrii", "Rodionov", 2);
        print(basicStudent.toJsonObject()); // {'name': 'Andrii', 'surname': 'Rodionov', 'year': 2}

    }

    private static void print(Json json) {
        System.out.println(json.toJson());
    }


    public static JsonObject sessionResult() {
        JsonObject jsonObject = new JsonObject();
        JsonPair name = new JsonPair("name", new JsonString("Andrii"));
        JsonPair surname = new JsonPair("surname", new JsonString("Rodionov"));
        JsonPair year = new JsonPair("year", new JsonNumber(2));
        JsonPair c1 = new JsonPair("course", new JsonString("OOP"));
        JsonPair p1 = new JsonPair("passed", new JsonBoolean(true));
        JsonPair m1 = new JsonPair("mark", new JsonNumber(3));

        JsonPair m2 = new JsonPair("mark", new JsonNumber(5));
        JsonPair p2 = new JsonPair("passed", new JsonBoolean(true));
        JsonPair c2 = new JsonPair("course", new JsonString("English"));

        JsonPair c3 = new JsonPair("course", new JsonString("Math"));
        JsonPair m3 = new JsonPair("mark", new JsonNumber(2));
        JsonPair p3 = new JsonPair("passed", new JsonBoolean(false));


        JsonObject jsonObjectCourse2 = new JsonObject(c2, m2, p2);
        JsonObject jsonObjectCourse1 = new JsonObject(c1, m1, p1);
        JsonObject jsonObjectCourse3 = new JsonObject(c3, m3, p3);

        Json courses = new JsonArray(jsonObjectCourse1, jsonObjectCourse2, jsonObjectCourse3);
        JsonPair exams = new JsonPair("exams", courses);
        JsonObject all = new JsonObject(name, surname, year, exams);
        return all;


    }
}



