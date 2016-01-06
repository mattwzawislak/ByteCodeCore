package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class BooleanElementValue extends ElementValue {

    public static final String IDENTIFIER = "BooleanElementValue";

    private static final int TAG = 'Z';

    private final int constantValueIndex;

    public BooleanElementValue(final int constantValueIndex) {
        super(TAG);
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
