//
// \uc774 \ud30c\uc77c\uc740 JAXB(JavaTM Architecture for XML Binding) \ucc38\uc870 \uad6c\ud604 2.2.5-2 \ubc84\uc804\uc744 \ud1b5\ud574 \uc0dd\uc131\ub418\uc5c8\uc2b5\ub2c8\ub2e4. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>\ub97c \ucc38\uc870\ud558\uc2ed\uc2dc\uc624. 
// \uc774 \ud30c\uc77c\uc744 \uc218\uc815\ud558\uba74 \uc18c\uc2a4 \uc2a4\ud0a4\ub9c8\ub97c \uc7ac\ucef4\ud30c\uc77c\ud560 \ub54c \uc218\uc815 \uc0ac\ud56d\uc774 \uc190\uc2e4\ub429\ub2c8\ub2e4. 
// \uc0dd\uc131 \ub0a0\uc9dc: 2017.11.14 \uc2dc\uac04 03:12:15 PM KST 
//


package tag.atsc_org_2016.xmlschemas.atsc3.delivery.aeat._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>audienceType\uc5d0 \ub300\ud55c Java \ud074\ub798\uc2a4\uc785\ub2c8\ub2e4.
 * 
 * <p>\ub2e4\uc74c \uc2a4\ud0a4\ub9c8 \ub2e8\ud3b8\uc774 \uc774 \ud074\ub798\uc2a4\uc5d0 \ud3ec\ud568\ub418\ub294 \ud544\uc694\ud55c \ucf58\ud150\uce20\ub97c \uc9c0\uc815\ud569\ub2c8\ub2e4.
 * <p>
 * <pre>
 * &lt;simpleType name="audienceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="public"/>
 *     &lt;enumeration value="restricted"/>
 *     &lt;enumeration value="private"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "audienceType")
@XmlEnum
public enum AudienceType {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("restricted")
    RESTRICTED("restricted"),
    @XmlEnumValue("private")
    PRIVATE("private");
    private final String value;

    AudienceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceType fromValue(String v) {
        for (AudienceType c: AudienceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
