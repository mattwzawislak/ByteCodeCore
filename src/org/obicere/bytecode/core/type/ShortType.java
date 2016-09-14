package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class ShortType implements Type {

    private static final ShortType TYPE = new ShortType();

    private ShortType() {

    }

    public static ShortType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "short";
    }

    @Override
    public String getSimpleName() {
        return "short";
    }

    @Override
    public String getCanonicalName() {
        return "short";
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
