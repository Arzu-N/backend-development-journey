
package org.examle.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.examle.soapclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Getuser_QNAME = new QName("http://ws.SoapService.soapservice.example.org/", "getuser");
    private final static QName _Getalluser_QNAME = new QName("http://ws.SoapService.soapservice.example.org/", "getalluser");
    private final static QName _GetalluserResponse_QNAME = new QName("http://ws.SoapService.soapservice.example.org/", "getalluserResponse");
    private final static QName _GetuserResponse_QNAME = new QName("http://ws.SoapService.soapservice.example.org/", "getuserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.examle.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Getalluser }
     * 
     */
    public org.examle.soapclient.Getalluser createGetalluser() {
        return new org.examle.soapclient.Getalluser();
    }

    /**
     * Create an instance of {@link Getuser }
     * 
     */
    public Getuser createGetuser() {
        return new Getuser();
    }

    /**
     * Create an instance of {@link GetuserResponse }
     * 
     */
    public org.examle.soapclient.GetuserResponse createGetuserResponse() {
        return new org.examle.soapclient.GetuserResponse();
    }

    /**
     * Create an instance of {@link GetalluserResponse }
     * 
     */
    public org.examle.soapclient.GetalluserResponse createGetalluserResponse() {
        return new org.examle.soapclient.GetalluserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getuser")
    public JAXBElement<Getuser> createGetuser(Getuser value) {
        return new JAXBElement<Getuser>(_Getuser_QNAME, Getuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getalluser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getalluser")
    public JAXBElement<org.examle.soapclient.Getalluser> createGetalluser(org.examle.soapclient.Getalluser value) {
        return new JAXBElement<org.examle.soapclient.Getalluser>(_Getalluser_QNAME, org.examle.soapclient.Getalluser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetalluserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getalluserResponse")
    public JAXBElement<org.examle.soapclient.GetalluserResponse> createGetalluserResponse(org.examle.soapclient.GetalluserResponse value) {
        return new JAXBElement<org.examle.soapclient.GetalluserResponse>(_GetalluserResponse_QNAME, org.examle.soapclient.GetalluserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getuserResponse")
    public JAXBElement<org.examle.soapclient.GetuserResponse> createGetuserResponse(org.examle.soapclient.GetuserResponse value) {
        return new JAXBElement<org.examle.soapclient.GetuserResponse>(_GetuserResponse_QNAME, org.examle.soapclient.GetuserResponse.class, null, value);
    }

}
