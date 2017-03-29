package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ByteElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultByteElementValue extends AbstractElementValue implements ByteElementValue {

    private final byte value;

    public DefaultByteElementValue(final byte value) {
        super(ElementValues.TAG_BYTE);
        this.value = value;
    }

    @Override
    public byte getValue() {
        return value;
    }
}
