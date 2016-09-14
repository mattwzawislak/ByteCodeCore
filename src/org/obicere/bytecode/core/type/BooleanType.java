package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class BooleanType implements Type {

    private static final BooleanType TYPE = new BooleanType();

    private BooleanType() {

    }

    public static BooleanType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "boolean";
    }

    @Override
    public String getSimpleName() {
        return "boolean";
    }

    @Override
    public String getCanonicalName() {
        return "boolean";
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public boolean isGeneric() {
        return false;
    }

    @Override
    public boolean isArray() {
        return false;
    }
}
