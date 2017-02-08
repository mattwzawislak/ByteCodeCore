package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ByteElementValue;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class DefaultByteElementValue extends AbstractElementValue implements ByteElementValue {

    private final byte value;

    public DefaultByteElementValue(final byte value) {
        super(ElementValueReader.TAG_BYTE);
        this.value = value;
    }

    @Override
    public byte getValue() {
        return value;
    }
}
