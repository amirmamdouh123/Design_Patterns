package main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse;

import main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse.Services.RestfulService;
import main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse.Services.SoapService;
import org.xml.sax.InputSource;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;

public class SoapToRestAdapter implements RestfulService {

    SoapService soapService;

    public SoapToRestAdapter(SoapService soapService) {
        this.soapService = soapService;
    }

    @Override
    public String getUserInfo(String userId) {
        String soap= soapService.fetchUserDetails(userId);
        return parseSoapResponse(soap);
    }

    //parse soap xml response to extract relevant user information (ID and name), and convert this information into a JSON string format.
    private String parseSoapResponse(String soapResponse) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(soapResponse)));
            XPath xPath = XPathFactory.newInstance().newXPath();
            String userId = (String) xPath.evaluate("/user/id", document, XPathConstants.STRING);
            String userName = (String) xPath.evaluate("/user/name", document, XPathConstants.STRING);
            return "{\"id\": \"" + userId + "\", \"name\": \"" + userName + "\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }

}