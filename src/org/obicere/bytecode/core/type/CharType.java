package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class CharType implements Type {

    private static final CharType TYPE = new CharType();

    private CharType() {

    }

    public static CharType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "char";
    }

    @Override
    public String getSimpleName() {
        return "char";
    }

    @Override
    public String getCanonicalName() {
        return "char";
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
