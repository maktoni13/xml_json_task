package lab.model.xml.parser;

import java.io.File;

public interface EntityXmlParser<T> {
    String ERROR_XML_CREATING = "XML creating error";
    String ERROR_XML_PARSING = "XML parsing error";

    boolean createXmlFile(T entity, File file);
    boolean createXmlFile(T entity, String path);
    T parseXmlFile(File file);
    T parseXmlFile(String path);
}
