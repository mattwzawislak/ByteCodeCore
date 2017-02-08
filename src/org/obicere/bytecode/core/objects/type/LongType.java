package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class LongType implements PrimitiveType {

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
}
