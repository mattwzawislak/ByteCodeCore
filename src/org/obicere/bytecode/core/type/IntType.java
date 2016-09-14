package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class IntType implements Type {

    private static final IntType TYPE = new IntType();

    private IntType() {

    }

    public static IntType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "int";
    }

    @Override
    public String getSimpleName() {
        return "int";
    }

    @Override
    public String getCanonicalName() {
        return "int";
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
