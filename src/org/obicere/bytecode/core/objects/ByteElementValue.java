package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ByteElementValue extends ElementValue {

    public static final String IDENTIFIER = "ByteElementValue";

    private static final int TAG = 'B';

    private final int constantValueIndex;

    public ByteElementValue(final int constantValueIndex) {
        super(TAG);
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
