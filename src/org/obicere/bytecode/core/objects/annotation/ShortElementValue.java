package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.reader.annotation.ElementValueReader;

/**
 * @author Obicere
 */
public class ShortElementValue extends ElementValue {

    public static final String IDENTIFIER = "ShortElementValue";

    private final short value;

    public ShortElementValue(final short value) {
        super(ElementValueReader.TAG_SHORT);
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
