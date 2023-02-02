package com.example;





import com.google.gson.JsonSyntaxException;

// Don't forget the module-info.java

public class Model {
    public static JsonObject parse(String jsonString) {
        JsonObject json = new Gson().fromJson(
            jsonString, JsonObject.class);
        return json;
    }
}
