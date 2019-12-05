package json;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Math;
import java.util.List;
/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    private final ArrayList<JsonPair> JSONPairs = new ArrayList<>();

    public JsonObject(JsonPair... jsonPairs) {
        this.JSONPairs.addAll(Arrays.asList(jsonPairs));
    }


    @Override
    public String toJson() {
        String js = "{";
         for (JsonPair json: JSONPairs) {
            js +="'"+ json.key + "': ";
            js += json.value.toJson() +", ";
            }
            int n = Math.abs(js.length() -2);
            js = js.substring(0, n) + "}";
            return js;
    }

    public void add(JsonPair jsonPair) {

        JSONPairs.add(jsonPair);
    }

    public Json find(String name) {
        for (JsonPair jsons: JSONPairs){
            if (jsons.key.equals(name)){
                return jsons.value;
            }
        }
        return null;
    }



    public JsonObject projection(String... names) {
        JsonObject projectedObject = new JsonObject();
        for (String name : names) {
            if (Arrays.asList(JSONPairs).contains(name)) {
//                JsonPair p_pair = new JsonPair(name, JsonPairs.value);
//                projectedObject.add(p_pair);
                continue;
            }

            }
        return projectedObject;
        }




    }

