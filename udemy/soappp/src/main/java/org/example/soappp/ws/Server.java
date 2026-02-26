package org.example.soappp.ws;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/education",new EducationService());
        System.out.println("Server started ad http://localhost:8080/education?wsdl");
    }
}
