package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public interface Type {

    public String getDescriptor();

    public String getName();

    public String getSimpleName();

    public String getCanonicalName();

    public boolean isPrimitive();

    public boolean isGeneric();

    public boolean isArray();

}
