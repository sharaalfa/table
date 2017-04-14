package sharafutdinov.artur.testsb.data;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by first on 14.04.17.
 */
public class FromXML {
    private String doc;
    private String field;




    public String withXML(String doc, String field){
        try {
            File fromXml1 = new File("/home/first/Yandex.Disk/Java_study/testsb/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(fromXml1);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName(doc);

            Node node = nodeList.item(0);
            Element element = (Element) node;
            String amount = element.getElementsByTagName(field).item(0).getTextContent();
            System.out.println(amount);
            /*String amount2 = element.getElementsByTagName("field2").item(0).getTextContent();
            String amount3= element.getElementsByTagName("field3").item(0).getTextContent();
            double amount4 = Double.parseDouble(element.getElementsByTagName("field4").item(0).getTextContent());
            double amount5 = Double.parseDouble(element.getElementsByTagName("field5").item(0).getTextContent());
            String amount6 = element.getElementsByTagName("field6").item(0).getTextContent();*/
            return amount;



        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
