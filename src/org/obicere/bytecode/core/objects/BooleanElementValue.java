package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ElementValueReader;

/**
 * @author Obicere
 */
public class BooleanElementValue extends ElementValue {

    public static final String IDENTIFIER = "BooleanElementValue";

    private final int constantValueIndex;

    public BooleanElementValue(final int constantValueIndex) {
        super(ElementValueReader.TAG_BOOLEAN);
        this.constantValueIndex = constantValueIndex;
    }

    public int getConstantValueIndex() {
        return constantValueIndex;
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
