package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ShortElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultShortElementValue extends AbstractElementValue implements ShortElementValue {

    private final short value;

    public DefaultShortElementValue(final short value) {
        super(ElementValues.TAG_SHORT);
        this.value = value;
    }

    @Override
    public short getValue() {
        return value;
    }
}
