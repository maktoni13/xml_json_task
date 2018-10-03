package lab.model.json.parser;

import java.io.File;
import java.net.URL;

public interface EntityJsonParser<T> {
    String ERROR_JSON_CREATING = "JSON creating error";
    String ERROR_JSON_PARSING = "JSON parsing error";
    String CHARSET_UTF = "UTF-8";

    boolean createJsonFile(T entity, File file);
    boolean createJsonFile(T entity, String path);
    T parseJson(java.net.URL url);
    T parseJson(File file);
    T parseJson(String path);
    T parseJsonString(String json);
    T parseJsonFile(File file);
    T parseJsonFile(String path);
    T parseJsonUrl(URL url);
}
