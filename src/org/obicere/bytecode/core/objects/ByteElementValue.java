package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class ByteElementValue extends ElementValue {

    public static final String IDENTIFIER = "ByteElementValue";

    private final int constantValueIndex;

    public ByteElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_BYTE);
        this.constantValueIndex = constantValueIndex;
    }

    public int getConstantValueIndex() {
        return constantValueIndex;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
