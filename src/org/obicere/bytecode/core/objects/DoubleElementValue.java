package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class DoubleElementValue extends ElementValue {

    public static final String IDENTIFIER = "DoubleElementValue";

    private static final int TAG = 'D';

    private final int constantValueIndex;

    public DoubleElementValue(final int constantValueIndex) {
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
