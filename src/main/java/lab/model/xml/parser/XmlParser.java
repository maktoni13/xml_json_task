package lab.model.xml.parser;

import lab.model.xml.entity.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlParser {
    private Catalog catalog;

    public XmlParser() {
    }

    public XmlParser(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public boolean createXmlFileJaxb(Catalog catalog, String path){
        File file = new File(path);
        return createXmlFileJaxb(catalog, file);
    }

    public boolean createXmlFileJaxb(Catalog catalog, File file){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(catalog, file);
        } catch (JAXBException e){
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Catalog parseXmlFileJaxb(File file){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (Catalog) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e){
            return null;
        }
    }

}
