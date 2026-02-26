package org.example.soapservice.SoapService.ws;

import jakarta.xml.ws.Service;
import org.example.soapservice.SoapService.bean.User;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class SoapClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8082/education?wsdl");
        QName qname = new QName("http://ws.SoapService.soapservice.example.org/", "EducationService");
        Service service = Service.create(url, qname);
        EducationService port = service.getPort(EducationService.class);
        User result = port.getuser("Semed");
        System.out.println(result);


    }}

