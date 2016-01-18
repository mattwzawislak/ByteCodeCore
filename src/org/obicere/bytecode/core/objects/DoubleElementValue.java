package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class DoubleElementValue extends ElementValue {

    public static final String IDENTIFIER = "DoubleElementValue";

    private final int constantValueIndex;

    public DoubleElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_DOUBLE);
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
