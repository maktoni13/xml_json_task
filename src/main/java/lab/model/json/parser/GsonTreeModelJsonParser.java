package lab.model.json.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lab.model.json.entity.CurrencyCatalog;

import java.io.File;
import java.net.URL;

public class GsonTreeModelJsonParser implements EntityJsonParser<CurrencyCatalog>{
    @Override
    public boolean createJsonFile(CurrencyCatalog entity, File file) {
        return false;
    }

    @Override
    public boolean createJsonFile(CurrencyCatalog entity, String path) {
        return false;
    }

    @Override
    public CurrencyCatalog parseJsonFile(File file) {
        return null;
    }

    @Override
    public CurrencyCatalog parseJsonFile(String path) {
        return null;
    }

    @Override
    public CurrencyCatalog parseJsonUrl(URL url) {
        return null;
    }

    @Override
    public CurrencyCatalog parseJsonString(String json) {
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(json);
        JsonObject rootObject = jsonElement.getAsJsonObject();
//        String message = rootObject.get("message").getAsString();
//        JsonObject childObject = rootObject.getAsJsonObject("place");
//        String place = childObject.get("name").getAsString();
        return null;
    }
}
