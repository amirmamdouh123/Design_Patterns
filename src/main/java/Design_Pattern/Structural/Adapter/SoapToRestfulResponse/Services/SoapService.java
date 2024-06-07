package main.java.Design_Pattern.Structural.Adapter.SoapToRestfulResponse.Services;

public class SoapService {

    public String fetchUserDetails(String userId) {
        // Simulate a SOAP service call
        return "<user><id>" + userId + "</id><name>John Doe</name></user>";
    }

}
