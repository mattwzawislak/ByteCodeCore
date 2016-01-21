package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class ShortElementValue extends ElementValue {

    public static final String IDENTIFIER = "ShortElementValue";

    private final int constantValueIndex;

    public ShortElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_SHORT);
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
