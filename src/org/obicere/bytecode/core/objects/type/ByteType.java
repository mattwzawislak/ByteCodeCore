package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class ByteType implements PrimitiveType {

    private static final ByteType TYPE = new ByteType();

    private ByteType() {

    }

    public static ByteType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "byte";
    }

    @Override
    public String getSimpleName() {
        return "byte";
    }

    @Override
    public String getCanonicalName() {
        return "byte";
    }
}
