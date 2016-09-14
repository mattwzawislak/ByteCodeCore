package org.obicere.bytecode.core.type.generic;

import org.obicere.bytecode.core.type.GenericType;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public interface GenericDeclaration {

    public GenericType[] getGenericTypes();

    public GenericType getGenericType(final String name);

    public TypeFactory getFactory();

}
