//
// \uc774 \ud30c\uc77c\uc740 JAXB(JavaTM Architecture for XML Binding) \ucc38\uc870 \uad6c\ud604 2.2.5-2 \ubc84\uc804\uc744 \ud1b5\ud574 \uc0dd\uc131\ub418\uc5c8\uc2b5\ub2c8\ub2e4. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>\ub97c \ucc38\uc870\ud558\uc2ed\uc2dc\uc624. 
// \uc774 \ud30c\uc77c\uc744 \uc218\uc815\ud558\uba74 \uc18c\uc2a4 \uc2a4\ud0a4\ub9c8\ub97c \uc7ac\ucef4\ud30c\uc77c\ud560 \ub54c \uc218\uc815 \uc0ac\ud56d\uc774 \uc190\uc2e4\ub429\ub2c8\ub2e4. 
// \uc0dd\uc131 \ub0a0\uc9dc: 2017.11.14 \uc2dc\uac04 03:12:15 PM KST 
//


package tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>AEAType complex type\uc5d0 \ub300\ud55c Java \ud074\ub798\uc2a4\uc785\ub2c8\ub2e4.
 * 
 * <p>\ub2e4\uc74c \uc2a4\ud0a4\ub9c8 \ub2e8\ud3b8\uc774 \uc774 \ud074\ub798\uc2a4\uc5d0 \ud3ec\ud568\ub418\ub294 \ud544\uc694\ud55c \ucf58\ud150\uce20\ub97c \uc9c0\uc815\ud569\ub2c8\ub2e4.
 * 
 * <pre>
 * &lt;complexType name="AEAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}headerType" minOccurs="0"/>
 *         &lt;element name="AEAText" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}langType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LiveMedia" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}liveMediaType" minOccurs="0"/>
 *         &lt;element name="Media" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}mediaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="aeaId" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}aeaIdType" />
 *       &lt;attribute name="issuer" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}issuerType" />
 *       &lt;attribute name="audience" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}audienceType" />
 *       &lt;attribute name="aeaType" use="required" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}AEAtypeType" />
 *       &lt;attribute name="refAEAId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" type="{tag:atsc.org,2016:XMLSchemas/ATSC3/Delivery/AEAT/1.0/}priorityType" />
 *       &lt;attribute name="wakeup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AEAType", propOrder = {
    "header",
    "aeaText",
    "liveMedia",
    "media",
    "any"
})
public class AEAType {

    @XmlElement(name = "Header")
    protected HeaderType header;
    @XmlElement(name = "AEAText")
    protected List<LangType> aeaText;
    @XmlElement(name = "LiveMedia")
    protected LiveMediaType liveMedia;
    @XmlElement(name = "Media")
    protected List<MediaType> media;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "aeaId", required = true)
    protected String aeaId;
    @XmlAttribute(name = "issuer", required = true)
    protected String issuer;
    @XmlAttribute(name = "audience", required = true)
    protected AudienceType audience;
    @XmlAttribute(name = "aeaType", required = true)
    protected AEAtypeType aeaType;
    @XmlAttribute(name = "refAEAId")
    protected String refAEAId;
    @XmlAttribute(name = "priority")
    protected Short priority;
    @XmlAttribute(name = "wakeup")
    protected Boolean wakeup;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * header \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * header \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the aeaText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeaText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEAText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangType }
     * 
     * 
     */
    public List<LangType> getAEAText() {
        if (aeaText == null) {
            aeaText = new ArrayList<LangType>();
        }
        return this.aeaText;
    }

    /**
     * liveMedia \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link LiveMediaType }
     *     
     */
    public LiveMediaType getLiveMedia() {
        return liveMedia;
    }

    /**
     * liveMedia \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveMediaType }
     *     
     */
    public void setLiveMedia(LiveMediaType value) {
        this.liveMedia = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaType }
     * 
     * 
     */
    public List<MediaType> getMedia() {
        if (media == null) {
            media = new ArrayList<MediaType>();
        }
        return this.media;
    }

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
     * aeaId \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeaId() {
        return aeaId;
    }

    /**
     * aeaId \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeaId(String value) {
        this.aeaId = value;
    }

    /**
     * issuer \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * issuer \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * audience \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link AudienceType }
     *     
     */
    public AudienceType getAudience() {
        return audience;
    }

    /**
     * audience \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceType }
     *     
     */
    public void setAudience(AudienceType value) {
        this.audience = value;
    }

    /**
     * aeaType \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link AEAtypeType }
     *     
     */
    public AEAtypeType getAeaType() {
        return aeaType;
    }

    /**
     * aeaType \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link AEAtypeType }
     *     
     */
    public void setAeaType(AEAtypeType value) {
        this.aeaType = value;
    }

    /**
     * refAEAId \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAEAId() {
        return refAEAId;
    }

    /**
     * refAEAId \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAEAId(String value) {
        this.refAEAId = value;
    }

    /**
     * priority \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * priority \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * wakeup \uc18d\uc131\uc758 \uac12\uc744 \uac00\uc838\uc635\ub2c8\ub2e4.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWakeup() {
        if (wakeup == null) {
            return false;
        } else {
            return wakeup;
        }
    }

    /**
     * wakeup \uc18d\uc131\uc758 \uac12\uc744 \uc124\uc815\ud569\ub2c8\ub2e4.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWakeup(Boolean value) {
        this.wakeup = value;
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
