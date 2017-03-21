package org.obicere.bytecode.core.objects.type;

import org.javacore.type.IntegralType;

/**
 * @author Obicere
 */
public final class LongType implements IntegralType {

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
