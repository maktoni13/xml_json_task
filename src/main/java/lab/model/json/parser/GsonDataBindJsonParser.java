package lab.model.json.parser;

import com.google.gson.Gson;
import lab.model.json.entity.CurrencyCatalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class GsonDataBindJsonParser implements EntityJsonParser<CurrencyCatalog> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GsonDataBindJsonParser.class);

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
        Gson gson = new Gson();
        return gson.fromJson(json, CurrencyCatalog.class);
    }

    @Override
    public CurrencyCatalog parseJson(URL url) {
        return null;
    }

    @Override
    public CurrencyCatalog parseJson(File file) {
        return null;
    }

    @Override
    public CurrencyCatalog parseJson(String path) {
        return null;
    }
}
