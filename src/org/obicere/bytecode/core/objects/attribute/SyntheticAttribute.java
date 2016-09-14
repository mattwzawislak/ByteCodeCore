package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class SyntheticAttribute extends Attribute {

    public static final String IDENTIFIER = "SyntheticAttribute";

    private static final SyntheticAttribute INSTANCE = new SyntheticAttribute();

    private SyntheticAttribute() {
    }

    public static SyntheticAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
