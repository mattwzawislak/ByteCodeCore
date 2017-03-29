package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.StringElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultStringElementValue extends AbstractElementValue implements StringElementValue {

    private final String value;

    public DefaultStringElementValue(final String value) {
        super(ElementValues.TAG_STRING);
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
