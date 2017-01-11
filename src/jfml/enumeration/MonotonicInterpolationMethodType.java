package jfml.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monotonicInterpolationMethodType.
 * 
 * <pre>
 * &lt;simpleType name="monotonicInterpolationMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="linear"/&gt;
 *     &lt;enumeration value="cubic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * @author sotillo19
 */
@XmlType(name = "monotonicInterpolationMethodType")
@XmlEnum
public enum MonotonicInterpolationMethodType {

    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("cubic")
    CUBIC("cubic");
    private final String value;

    MonotonicInterpolationMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonotonicInterpolationMethodType fromValue(String v) {
        for (MonotonicInterpolationMethodType c: MonotonicInterpolationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
