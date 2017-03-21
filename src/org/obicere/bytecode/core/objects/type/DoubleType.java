package org.obicere.bytecode.core.objects.type;

import org.javacore.type.FloatingPointType;

/**
 * @author Obicere
 */
public final class DoubleType implements FloatingPointType {

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
