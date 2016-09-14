package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class DeprecatedAttribute extends Attribute {

    public static final String IDENTIFIER = "DeprecatedAttribute";

    private static final DeprecatedAttribute INSTANCE = new DeprecatedAttribute();

    private DeprecatedAttribute() {
    }

    public static DeprecatedAttribute getInstance() {
        return INSTANCE;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
