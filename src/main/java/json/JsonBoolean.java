package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {
    private final Boolean bool;
    public JsonBoolean(Boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toJson() {

        if (bool){
            return "true";
        }
        else if (!bool){
            return "false";
        }
        return null;
    }
}
