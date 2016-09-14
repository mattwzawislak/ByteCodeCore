package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class ByteType implements Type {

    private static final ByteType TYPE = new ByteType();

    private ByteType() {

    }

    public static ByteType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "byte";
    }

    @Override
    public String getSimpleName() {
        return "byte";
    }

    @Override
    public String getCanonicalName() {
        return "byte";
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
