package lab;

import com.google.gson.stream.JsonReader;
import lab.model.xml.entity.Catalog;
import lab.model.xml.entity.Notebook;
import lab.model.xml.entity.Person;
import lab.model.xml.parser.XmlParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Hello world!
 */
public class App {
    private static final String FINANCE_INFO_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
    public static void parseJSON() {
    }
    public static void main(String[] args) throws IOException{
        URL site = new URL(FINANCE_INFO_URL);
        InputStreamReader inputStreamReader = new InputStreamReader(site.openStream());
        JsonReader jsonReader = new JsonReader(inputStreamReader);


        System.out.println("Hello World!");

        Catalog catalog = new Catalog();
        Notebook notebook = new Notebook();
        notebook.getPersonList().add(new Person(1, "John", "sadasdas", 99999, "sa"));
        notebook.getPersonList().add(new Person(2, "AAaa", "sadasdas", 99999, "sa"));
        notebook.getPersonList().add(new Person(3, "Bbb", "sadasdas", 2222, "sa"));
        catalog.setNotebook(notebook);
        XmlParser xmlParser = new XmlParser();
        xmlParser.createXmlFileJaxb(catalog, "c:\\temp\\test.xml");

    }
}
