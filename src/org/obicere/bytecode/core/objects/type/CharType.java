package org.obicere.bytecode.core.objects.type;

import org.javacore.type.PrimitiveType;

/**
 * @author Obicere
 */
public final class CharType implements PrimitiveType {

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
}
