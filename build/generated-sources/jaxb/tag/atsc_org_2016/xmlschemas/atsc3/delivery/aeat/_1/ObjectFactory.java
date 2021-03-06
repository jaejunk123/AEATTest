//
// \uc774 \ud30c\uc77c\uc740 JAXB(JavaTM Architecture for XML Binding) \ucc38\uc870 \uad6c\ud604 2.2.5-2 \ubc84\uc804\uc744 \ud1b5\ud574 \uc0dd\uc131\ub418\uc5c8\uc2b5\ub2c8\ub2e4. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>\ub97c \ucc38\uc870\ud558\uc2ed\uc2dc\uc624. 
// \uc774 \ud30c\uc77c\uc744 \uc218\uc815\ud558\uba74 \uc18c\uc2a4 \uc2a4\ud0a4\ub9c8\ub97c \uc7ac\ucef4\ud30c\uc77c\ud560 \ub54c \uc218\uc815 \uc0ac\ud56d\uc774 \uc190\uc2e4\ub429\ub2c8\ub2e4. 
// \uc0dd\uc131 \ub0a0\uc9dc: 2017.11.14 \uc2dc\uac04 03:12:15 PM KST 
//


package tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1 package. 
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
@XmlRootElement
public class ObjectFactory {

    private final static QName _AEAT_QNAME = new QName("tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/", "AEAT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AEATType }
     * 
     */
    public AEATType createAEATType() {
        return new AEATType();
    }

    /**
     * Create an instance of {@link TypeType }
     * 
     */
    public TypeType createTypeType() {
        return new TypeType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link LangType }
     * 
     */
    public LangType createLangType() {
        return new LangType();
    }

    /**
     * Create an instance of {@link AEAType }
     * 
     */
    public AEAType createAEAType() {
        return new AEAType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link LiveMediaType }
     * 
     */
    public LiveMediaType createLiveMediaType() {
        return new LiveMediaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AEATType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/", name = "AEAT")
    public JAXBElement<AEATType> createAEAT(AEATType value) {
        return new JAXBElement<AEATType>(_AEAT_QNAME, AEATType.class, null, value);
    }

}
