package lab.model.json.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import lab.model.json.entity.Rate;

import java.lang.reflect.Type;

public class RateSerializer implements JsonSerializer<Rate> {
    @Override
    public JsonElement serialize(Rate rate, Type type, JsonSerializationContext jsonSerializationContext) {

        return null;
    }
}
