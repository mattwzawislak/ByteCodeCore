package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class FloatElementValue extends ElementValue {

    public static final String IDENTIFIER = "FloatElementValue";

    private final int constantValueIndex;

    public FloatElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_FLOAT);
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
