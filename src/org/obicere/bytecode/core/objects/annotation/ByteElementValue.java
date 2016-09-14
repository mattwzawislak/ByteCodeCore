package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class ByteElementValue extends ElementValue {

    public static final String IDENTIFIER = "ByteElementValue";

    private final byte value;

    public ByteElementValue(final byte value) {
        super(ElementValueReader.TAG_BYTE);
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
