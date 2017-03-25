package org.obicere.bytecode.core.objects.type.generic;

import org.javacore.JCClass;
import org.javacore.JCMethod;
import org.javacore.type.TypedClass;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.ClassGenericDeclaration;
import org.javacore.type.generic.GenericDeclaration;
import org.javacore.type.signature.ClassSignature;
import org.javacore.type.signature.ClassTypeSignature;

/**
 * @author Obicere
 */
public class DefaultClassGenericDeclaration extends AbstractGenericDeclaration<JCClass> implements ClassGenericDeclaration {

    private final JCClass classType;

    private volatile ClassTypeSignature superClass;

    private volatile ClassTypeSignature[] superInterfaces;

    private volatile TypedClass resolvedSuperClass;

    private volatile TypedClass[] resolvedSuperInterfaces;

    public DefaultClassGenericDeclaration(final JCClass classType, final ClassSignature signature, final TypeFactory factory) {
        super(signature.getTypeParameters(), factory);

        this.classType = classType;
        this.superClass = signature.getSuperClass();
        this.superInterfaces = signature.getSuperInterfaces();
    }

    @Override
    public TypedClass getGenericSuperClass() {
        TypedClass type = resolvedSuperClass;
        if (type == null) {
            type = (TypedClass) superClass.getType(getFactory());
            resolvedSuperClass = type;

            // discard old value
            // not thread safe
            superClass = null;
        }
        return type;
    }

    @Override
    public TypedClass[] getGenericSuperInterfaces() {
        TypedClass[] types = resolvedSuperInterfaces;
        if (types == null) {
            final TypeFactory factory = getFactory();
            final TypedClass[] newTypes = new TypedClass[superInterfaces.length];

            for (int i = 0; i < superInterfaces.length; i++) {
                final ClassTypeSignature superInterface = superInterfaces[i];
                newTypes[i] = (TypedClass) superInterface.getType(factory);
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
    public GenericDeclaration getOuterDeclaration() {
        // TODO: first, check enclosing method
        final JCMethod enclosing = classType.getEnclosingMethod();
        if(enclosing != null) {
            return enclosing.getDeclaration();
        }

        final JCClass outer = classType.getOuterClass();

        if (outer == null) {
            return null;
        } else {
            return outer.getDeclaration();
        }
    }

    @Override
    public JCClass getDeclarer() {
        return classType;
    }
}
