package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class FloatType implements Type {

    private static final FloatType TYPE = new FloatType();

    private FloatType() {

    }

    public static FloatType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "float";
    }

    @Override
    public String getSimpleName() {
        return "float";
    }

    @Override
    public String getCanonicalName() {
        return "float";
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
