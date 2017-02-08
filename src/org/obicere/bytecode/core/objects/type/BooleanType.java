package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class BooleanType implements PrimitiveType {

    private static final BooleanType TYPE = new BooleanType();

    private BooleanType() {

    }

    public static BooleanType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "boolean";
    }

    @Override
    public String getSimpleName() {
        return "boolean";
    }

    @Override
    public String getCanonicalName() {
        return "boolean";
    }
}
