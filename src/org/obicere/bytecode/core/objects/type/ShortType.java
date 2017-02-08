package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class ShortType implements PrimitiveType {

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
}
