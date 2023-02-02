package com.example;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonStreamParser;
import com.google.gson.JsonSyntaxException;

// Don't forget the module-info.java

public class Model {
    public static JsonObject parse(String jsonString) {
        JsonObject json = new Gson().fromJson(
            jsonString, JsonObject.class);
        return json;
    }
}
