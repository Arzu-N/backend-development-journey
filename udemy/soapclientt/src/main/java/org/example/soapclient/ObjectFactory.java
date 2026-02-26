
package org.example.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.soapclient package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Getalluser }
     * 
     */
    public org.example.soapclient.Getalluser createGetalluser() {
        return new org.example.soapclient.Getalluser();
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
    public GetuserResponse createGetuserResponse() {
        return new GetuserResponse();
    }

    /**
     * Create an instance of {@link GetalluserResponse }
     * 
     */
    public GetalluserResponse createGetalluserResponse() {
        return new GetalluserResponse();
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
    public JAXBElement<Getalluser> createGetalluser(Getalluser value) {
        return new JAXBElement<Getalluser>(_Getalluser_QNAME, Getalluser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetalluserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getalluserResponse")
    public JAXBElement<GetalluserResponse> createGetalluserResponse(GetalluserResponse value) {
        return new JAXBElement<GetalluserResponse>(_GetalluserResponse_QNAME, GetalluserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.SoapService.soapservice.example.org/", name = "getuserResponse")
    public JAXBElement<GetuserResponse> createGetuserResponse(GetuserResponse value) {
        return new JAXBElement<GetuserResponse>(_GetuserResponse_QNAME, GetuserResponse.class, null, value);
    }

}
