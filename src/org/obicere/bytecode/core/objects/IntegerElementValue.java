package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class IntegerElementValue extends ElementValue {

    public static final String IDENTIFIER = "IntegerElementValue";

    private final int constantValueIndex;

    public IntegerElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_INTEGER);
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
