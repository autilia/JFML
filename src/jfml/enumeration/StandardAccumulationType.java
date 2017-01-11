package jfml.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardAccumulationType.
 * 
 * <pre>
 * &lt;simpleType name="standardAccumulationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="PROBOR"/&gt;
 *     &lt;enumeration value="BSUM"/&gt;
 *     &lt;enumeration value="DRS"/&gt;
 *     &lt;enumeration value="ESUM"/&gt;
 *     &lt;enumeration value="HSUM"/&gt;
 *     &lt;enumeration value="NILMAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * @author sotillo19
 */
@XmlType(name = "standardAccumulationType")
@XmlEnum
public enum StandardAccumulationType {

    MAX,
    PROBOR,
    BSUM,
    DRS,
    ESUM,
    HSUM,
    NILMAX;

    public String value() {
        return name();
    }

    public static StandardAccumulationType fromValue(String v) {
        return valueOf(v);
    }

}
