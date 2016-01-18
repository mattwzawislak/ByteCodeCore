package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class DeprecatedAttribute extends Attribute {

    public static final String IDENTIFIER = "DeprecatedAttribute";

    public DeprecatedAttribute(final int length) {
        super(length);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
