//
// \uc774 \ud30c\uc77c\uc740 JAXB(JavaTM Architecture for XML Binding) \ucc38\uc870 \uad6c\ud604 2.2.5-2 \ubc84\uc804\uc744 \ud1b5\ud574 \uc0dd\uc131\ub418\uc5c8\uc2b5\ub2c8\ub2e4. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>\ub97c \ucc38\uc870\ud558\uc2ed\uc2dc\uc624. 
// \uc774 \ud30c\uc77c\uc744 \uc218\uc815\ud558\uba74 \uc18c\uc2a4 \uc2a4\ud0a4\ub9c8\ub97c \uc7ac\ucef4\ud30c\uc77c\ud560 \ub54c \uc218\uc815 \uc0ac\ud56d\uc774 \uc190\uc2e4\ub429\ub2c8\ub2e4. 
// \uc0dd\uc131 \ub0a0\uc9dc: 2017.11.14 \uc2dc\uac04 03:12:15 PM KST 
//


package tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>locationType complex type\uc5d0 \ub300\ud55c Java \ud074\ub798\uc2a4\uc785\ub2c8\ub2e4.
 * 
 * <p>\ub2e4\uc74c \uc2a4\ud0a4\ub9c8 \ub2e8\ud3b8\uc774 \uc774 \ud074\ub798\uc2a4\uc5d0 \ud3ec\ud568\ub418\ub294 \ud544\uc694\ud55c \ucf58\ud150\uce20\ub97c \uc9c0\uc815\ud569\ub2c8\ub2e4.
 * 
 * <pre>
 * &lt;complexType name="locationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}locationTypeType" />
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationType", propOrder = {
    "value"
})
@XmlRootElement
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected LocationTypeType type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * value \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * value \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * type \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeType }
     *     
     */
    public LocationTypeType getType() {
        return type;
    }

    /**
     * type \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeType }
     *     
     */
    public void setType(LocationTypeType value) {
        this.type = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
