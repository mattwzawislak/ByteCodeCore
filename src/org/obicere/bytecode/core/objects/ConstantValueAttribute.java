package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ConstantValueAttribute extends Attribute {

    public static final String IDENTIFIER = "ConstantValueAttribute";

    private final int constantValueIndex;

    public ConstantValueAttribute(final int length, final int constantValueIndex) {
        super(length);
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
