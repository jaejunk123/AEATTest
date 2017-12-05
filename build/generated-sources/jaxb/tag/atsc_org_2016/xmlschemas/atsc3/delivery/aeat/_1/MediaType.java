//
// \uc774 \ud30c\uc77c\uc740 JAXB(JavaTM Architecture for XML Binding) \ucc38\uc870 \uad6c\ud604 2.2.5-2 \ubc84\uc804\uc744 \ud1b5\ud574 \uc0dd\uc131\ub418\uc5c8\uc2b5\ub2c8\ub2e4. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>\ub97c \ucc38\uc870\ud558\uc2ed\uc2dc\uc624. 
// \uc774 \ud30c\uc77c\uc744 \uc218\uc815\ud558\uba74 \uc18c\uc2a4 \uc2a4\ud0a4\ub9c8\ub97c \uc7ac\ucef4\ud30c\uc77c\ud560 \ub54c \uc218\uc815 \uc0ac\ud56d\uc774 \uc190\uc2e4\ub429\ub2c8\ub2e4. 
// \uc0dd\uc131 \ub0a0\uc9dc: 2017.11.14 \uc2dc\uac04 03:12:15 PM KST 
//


package tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>mediaType complex type\uc5d0 \ub300\ud55c Java \ud074\ub798\uc2a4\uc785\ub2c8\ub2e4.
 * 
 * <p>\ub2e4\uc74c \uc2a4\ud0a4\ub9c8 \ub2e8\ud3b8\uc774 \uc774 \ud074\ub798\uc2a4\uc5d0 \ud3ec\ud568\ub418\ub294 \ud544\uc694\ud55c \ucf58\ud150\uce20\ub97c \uc9c0\uc815\ud569\ub2c8\ub2e4.
 * 
 * <pre>
 * &lt;complexType name="mediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="mediaDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaType" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}mediaTypeType" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="alternateUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentLength" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="mediaAssoc" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaType", propOrder = {
    "any"
})
@XmlRootElement
public class MediaType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "mediaDesc")
    protected String mediaDesc;
    @XmlAttribute(name = "mediaType")
    protected MediaTypeType mediaType;
    @XmlAttribute(name = "url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "alternateUrl")
    @XmlSchemaType(name = "anyURI")
    protected String alternateUrl;
    @XmlAttribute(name = "contentType")
    protected String contentType;
    @XmlAttribute(name = "contentLength")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger contentLength;
    @XmlAttribute(name = "mediaAssoc")
    @XmlSchemaType(name = "anyURI")
    protected String mediaAssoc;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * lang \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * lang \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * mediaDesc \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaDesc() {
        return mediaDesc;
    }

    /**
     * mediaDesc \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaDesc(String value) {
        this.mediaDesc = value;
    }

    /**
     * mediaType \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypeType }
     *     
     */
    public MediaTypeType getMediaType() {
        return mediaType;
    }

    /**
     * mediaType \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypeType }
     *     
     */
    public void setMediaType(MediaTypeType value) {
        this.mediaType = value;
    }

    /**
     * url \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * url \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * alternateUrl \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateUrl() {
        return alternateUrl;
    }

    /**
     * alternateUrl \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateUrl(String value) {
        this.alternateUrl = value;
    }

    /**
     * contentType \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * contentType \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * contentLength \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentLength() {
        return contentLength;
    }

    /**
     * contentLength \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentLength(BigInteger value) {
        this.contentLength = value;
    }

    /**
     * mediaAssoc \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAssoc() {
        return mediaAssoc;
    }

    /**
     * mediaAssoc \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAssoc(String value) {
        this.mediaAssoc = value;
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
