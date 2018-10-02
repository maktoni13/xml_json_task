package lab.model.xml.parser;

import lab.model.xml.entity.Catalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class JDomTreeModelXmlParser implements EntityXmlParser<Catalog>{
    private static final Logger LOGGER = LoggerFactory.getLogger(JDomTreeModelXmlParser.class);

    @Override
    public boolean createXmlFile(Catalog entity, File file) {
        return true;
    }

    @Override
    public boolean createXmlFile(Catalog entity, String path) {
        return false;
    }

    @Override
    public Catalog parseXmlFile(File file){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            Node root = document.getDocumentElement();
            NodeList nodeList = root.getChildNodes();
            NodeList notebookNodeList = document.getElementsByTagName("notebook");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e){
            LOGGER.error(ERROR_XML_CREATING, e);
            return null;
        }
        return null;

    }

    @Override
    public Catalog parseXmlFile(String path) {
        File file = new File(path);
        return parseXmlFile(file);
    }
}
