package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class FloatType implements PrimitiveType {

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
}
