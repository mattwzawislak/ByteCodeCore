package org.obicere.bytecode.core.type;

import org.obicere.bytecode.core.type.generic.GenericDeclaration;
import org.obicere.bytecode.core.type.signature.ReferenceTypeSignature;

/**
 * @author Obicere
 */
public class GenericType implements ReferenceType {

    private final GenericDeclaration declaration;

    private final String name;

    private volatile ReferenceTypeSignature classBound;

    private volatile ReferenceTypeSignature[] interfaceBounds;

    GenericType(final GenericDeclaration declaration, final String name, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
        this.declaration = declaration;
        this.name = name;
        this.classBound = classBound;
        this.interfaceBounds = interfaceBounds;
    }

    public GenericDeclaration getGenericDeclaration() {
        return declaration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSimpleName() {
        return name;
    }

    @Override
    public String getCanonicalName() {
        return name;
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }

    @Override
    public boolean isGeneric() {
        return true;
    }

    @Override
    public boolean isArray() {
        return false;
    }
}
