package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class StringElementValue extends ElementValue {

    public static final String IDENTIFIER = "StringElementValue";

    private final int constantValueIndex;

    public StringElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_STRING);
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
