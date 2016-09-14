package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class ConstantValueAttribute extends Attribute {

    public static final String IDENTIFIER = "ConstantValueAttribute";

    private final Object value;

    public ConstantValueAttribute(final Object value) {
        this.value = value;
    }

    public Object getConstant() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
