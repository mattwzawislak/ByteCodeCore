package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class LongElementValue extends ElementValue {

    public static final String IDENTIFIER = "LongElementValue";

    private final int constantValueIndex;

    public LongElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_LONG);
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
