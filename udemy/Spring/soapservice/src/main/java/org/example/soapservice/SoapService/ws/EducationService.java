package org.example.soapservice.SoapService.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.soapservice.SoapService.bean.User;

import java.util.List;
@WebService(serviceName ="EducationService",name="EducationService")
public interface EducationService {
            @WebMethod(operationName = "getuser")
        public User getuser(@WebParam(name="name")String name);
        @WebMethod(operationName = "getalluser")
        public List<User> getalluser(@WebParam(name="name")String name, @WebParam(name="surname")String surname);
    }

