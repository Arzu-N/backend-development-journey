package org.example.soapservice.SoapService.ws;

import jakarta.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/education",new EducationServiceimpl());
        System.out.println("Server started ad http://localhost:8082/education?wsdl");
    }
}
