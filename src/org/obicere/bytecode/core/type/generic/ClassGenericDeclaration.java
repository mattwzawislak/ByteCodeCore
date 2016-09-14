package org.obicere.bytecode.core.type.generic;

import org.obicere.bytecode.core.type.ClassType;
import org.obicere.bytecode.core.type.ParameterizedType;
import org.obicere.bytecode.core.type.ReferenceType;
import org.obicere.bytecode.core.type.generation.TypeFactory;
import org.obicere.bytecode.core.type.signature.ClassSignature;
import org.obicere.bytecode.core.type.signature.ClassTypeSignature;

/**
 * @author Obicere
 */
public class ClassGenericDeclaration extends AbstractGenericDeclaration {

    private final ClassType classType;

    private volatile ClassTypeSignature superClass;

    private volatile ClassTypeSignature[] superInterfaces;

    private volatile ReferenceType resolvedSuperClass;

    private volatile ClassType[] resolvedSuperInterfaces;

    public ClassGenericDeclaration(final ClassType classType, final ClassSignature signature, final TypeFactory factory) {
        super(signature.getTypeParameters(), factory);

        this.classType = classType;
        this.superClass = signature.getSuperClass();
        this.superInterfaces = signature.getSuperInterfaces();
    }

    public ReferenceType getSuperClass() {
        ReferenceType type = resolvedSuperClass;
        if (type == null) {
            type = (ReferenceType) superClass.getType(getFactory());
            resolvedSuperClass = type;

            // discard old value
            // not thread safe
            superClass = null;
        }
        return type;
    }

    public ClassType[] getSuperInterfaces() {
        ClassType[] types = resolvedSuperInterfaces;
        if (types == null) {
            final TypeFactory factory = getFactory();
            final ClassType[] newTypes = new ClassType[superInterfaces.length];

            for (int i = 0; i < superInterfaces.length; i++) {
                final ClassTypeSignature superInterface = superInterfaces[i];
                newTypes[i] = (ClassType) superInterface.getType(factory);
            }

            // cache result
            types = newTypes;
            resolvedSuperInterfaces = newTypes;
            // discard old values
            // not thread safe
            superInterfaces = null;
        }
        // be sure to return a copy
        return types.clone();
    }

    @Override
    protected GenericDeclaration getOuterDeclaration() {
        // TODO: first, check enclosing method

        final ReferenceType outer = classType.getOuterClass();

        if (outer == null) {
            return null;
        } else {
            // TODO: update if the parameterized type system changes
            final ClassType rawOuter;
            if (outer instanceof ParameterizedType) {
                rawOuter = ((ParameterizedType) outer).getRawType();
            } else {
                rawOuter = (ClassType) outer;
            }
            return rawOuter.getDeclaration();
        }
    }
}
