package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class SyntheticAttribute extends Attribute {

    public static final String IDENTIFIER = "SyntheticAttribute";

    public SyntheticAttribute(final int length) {
        super(length);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
