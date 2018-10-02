package lab.model.json.parser;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonParser {
    private static final String FINANCE_INFO_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
    public static void parseJSON() throws IOException {
        String json = new URL(FINANCE_INFO_URL).toString();
    }
}
