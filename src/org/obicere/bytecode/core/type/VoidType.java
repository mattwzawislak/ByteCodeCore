package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class VoidType implements Type {

    private static final VoidType TYPE = new VoidType();

    private VoidType() {
    }

    public static VoidType getInstance(){
        return TYPE;
    }

    @Override
    public String getName() {
        return "void";
    }

    @Override
    public String getSimpleName() {
        return "void";
    }

    @Override
    public String getCanonicalName() {
        return "void";
    }

    @Override
    public boolean isPrimitive() {
        return false;
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
