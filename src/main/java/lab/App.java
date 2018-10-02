package lab;

import lab.model.json.entity.CurrencyCatalog;
import lab.model.json.entity.CurrencyRate;
import lab.model.json.parser.EntityJsonParser;
import lab.model.json.parser.GsonJsonParser;
import lab.model.json.parser.GsonTreeModelJsonParser;
import lab.model.xml.entity.Catalog;
import lab.model.xml.entity.Notebook;
import lab.model.xml.entity.Person;
import lab.model.xml.parser.EntityXmlParser;
import lab.model.xml.parser.JDomTreeModelXmlParser;
import lab.model.xml.parser.JaxbDataBindXmlParser;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private static final String FINANCE_INFO_URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
    private static final String FILE_XML_LOCATION = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    public static void main(String[] args) throws IOException {

        //EntityXmlParser entityXmlParser = new JDomTreeModelXmlParser();

        //entityXmlParser.parseXmlFile()

        //        URL site = new URL(FINANCE_INFO_URL);
        //        InputStreamReader inputStreamReader = new InputStreamReader(site.openStream());
        //        JsonReader jsonReader = new JsonReader(inputStreamReader);
        //
        //
        //        System.out.println("Hello World!");
        //
        //        Catalog catalog = new Catalog();
        //        Notebook notebook = new Notebook();
        //        notebook.getPersonList().add(new Person(1, "John", "sadasdas", 99999, "sa"));
        //        notebook.getPersonList().add(new Person(2, "AAaa", "sadasdas", 99999, "sa"));
        //        notebook.getPersonList().add(new Person(3, "Bbb", "sadasdas", 2222, "sa"));
        //        catalog.setNotebook(notebook);
        //        EntityXmlParser<Catalog> xmlParser = new JaxbDataBindXmlParser();
        //        xmlParser.createXmlFile(catalog, "c:\\temp\\test.xml");
        //
        //        EntityXmlParser<Catalog> entityXmlParser = new JDomTreeModelXmlParser();
        //        entityXmlParser.parseXmlFile("c:\\temp\\test.xml");
//        String json = "[{\"r030\":36,\"txt\":\"Австралійський долар\",\"rate\":20.375627,\"cc\":\"AUD\",\"exchangedate\":\"02.10.2018\"}]";
        String json = "{\"rates\":[{\"r030\":36,\"txt\":\"Австралійський долар\",\"rate\":20.375627,\"cc\":\"AUD\",\"exchangedate\":\"02.10.2018\"}" +
                ",{\"r030\":124,\"txt\":\"Канадський долар\",\"rate\":22.024371,\"cc\":\"CAD\",\"exchangedate\":\"02.10.2018\"}]}";
        EntityJsonParser<CurrencyCatalog> entityJsonParser = new GsonJsonParser();
//        EntityJsonParser<CurrencyCatalog> entityJsonParser = new GsonTreeModelJsonParser();


        CurrencyCatalog currencyRateList = (CurrencyCatalog) entityJsonParser.parseJsonString(json);
        int a = 1;

    }
}
