package org.example.soapservice.SoapService.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.soapservice.SoapService.bean.User;


import java.util.Arrays;
import java.util.List;

@WebService(serviceName="EducationService",targetNamespace="http://ws.SoapService.soapservice.example.org/",endpointInterface="org.example.soapservice.SoapService.ws.EducationService")
public class EducationServiceimpl implements EducationService {
    @WebMethod(operationName = "getuser")
    public User getuser(@WebParam(name="name")String name){
        return new User(1,name,null);
    }
    @WebMethod(operationName = "getalluser")
    public List<User> getalluser(@WebParam(name="name")String name, @WebParam(name="surname")String surname){

        return  Arrays.asList(new User(1,name,surname),new User(2,name,surname));
    }
}
