package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class DoubleType implements Type {

    private static final DoubleType TYPE = new DoubleType();

    private DoubleType() {

    }

    public static DoubleType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "double";
    }

    @Override
    public String getSimpleName() {
        return "double";
    }

    @Override
    public String getCanonicalName() {
        return "double";
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
