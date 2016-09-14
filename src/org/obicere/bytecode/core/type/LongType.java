package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class LongType implements Type {

    private static final LongType TYPE = new LongType();

    private LongType() {

    }

    public static LongType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "long";
    }

    @Override
    public String getSimpleName() {
        return "long";
    }

    @Override
    public String getCanonicalName() {
        return "long";
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
