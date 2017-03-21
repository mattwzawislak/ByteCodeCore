package org.obicere.bytecode.core.objects.type;

import org.javacore.type.GenericType;
import org.javacore.type.ReferenceType;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.GenericDeclaration;
import org.javacore.type.signature.ReferenceTypeSignature;

/**
 * @author Obicere
 */
public class DefaultGenericType implements GenericType {

    private final GenericDeclaration<?> declaration;

    private final String name;

    private volatile ReferenceTypeSignature classBoundSignature;

    private volatile ReferenceTypeSignature[] interfaceBoundSignatures;

    private ReferenceType classBound;

    private ReferenceType[] interfaceBounds;

    public DefaultGenericType(final GenericDeclaration<?> declaration, final String name, final ReferenceTypeSignature classBoundSignature, final ReferenceTypeSignature[] interfaceBoundSignatures) {
        this.declaration = declaration;
        this.name = name;
        this.classBoundSignature = classBoundSignature;
        this.interfaceBoundSignatures = interfaceBoundSignatures;
    }

    @Override
    public GenericDeclaration<?> getGenericDeclaration() {
        return declaration;
    }

    public ReferenceType getClassBound() {
        if (classBound == null) {
            final TypeFactory factory = declaration.getFactory();
            this.classBound = (ReferenceType) classBoundSignature.getType(factory);
        }
        return classBound;
    }

    @Override
    public ReferenceType[] getInterfaceBounds() {
        if (interfaceBounds == null) {
            final TypeFactory factory = declaration.getFactory();
            final int length = interfaceBoundSignatures.length;

            interfaceBounds = new ReferenceType[length];
            for (int i = 0; i < length; i++) {
                interfaceBounds[i] = (ReferenceType) interfaceBoundSignatures[i].getType(factory);
            }
        }
        return interfaceBounds;
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
}
