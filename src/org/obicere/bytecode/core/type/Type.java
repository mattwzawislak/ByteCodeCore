package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public interface Type {

    public static Type of(final String name) {
        return TypeLoader.getSystemLoader().getType(name);
    }

    public static Type of(final Class cls) {
        return TypeLoader.getSystemLoader().getType(cls.getName());
    }

    public String getName();

    public String getSimpleName();

    public String getCanonicalName();

    public boolean isPrimitive();

    public boolean isGeneric();

    public boolean isArray();

}
