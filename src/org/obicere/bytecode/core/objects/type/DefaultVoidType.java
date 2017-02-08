package org.obicere.bytecode.core.objects.type;

import org.javacore.type.VoidType;

/**
 * @author Obicere
 */
public final class DefaultVoidType implements VoidType {

    private static final VoidType TYPE = new DefaultVoidType();

    private DefaultVoidType() {
    }

    public static VoidType getInstance() {
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
