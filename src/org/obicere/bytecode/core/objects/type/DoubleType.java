package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class DoubleType implements PrimitiveType {

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
}
