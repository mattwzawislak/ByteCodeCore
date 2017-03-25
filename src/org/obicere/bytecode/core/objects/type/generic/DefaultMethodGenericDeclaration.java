package org.obicere.bytecode.core.objects.type.generic;

import org.javacore.JCClass;
import org.javacore.JCMethod;
import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.GenericDeclaration;
import org.javacore.type.generic.MethodGenericDeclaration;
import org.javacore.type.signature.JavaTypeSignature;
import org.javacore.type.signature.MethodSignature;
import org.javacore.type.signature.ThrowsSignature;
import org.javacore.type.signature.TypeSignature;

/**
 * @author Obicere
 */
public class DefaultMethodGenericDeclaration extends AbstractGenericDeclaration<JCMethod> implements MethodGenericDeclaration {

    private final JCMethod method;

    private volatile JavaTypeSignature[] parameters;

    private volatile TypeSignature returnType;

    private volatile ThrowsSignature[] exceptions;

    private volatile Type[] resolvedParameters;

    private volatile Type resolvedReturnType;

    private volatile Type[] resolvedExceptions;

    public DefaultMethodGenericDeclaration(final JCMethod method, final MethodSignature signature, final TypeFactory factory) {
        super(signature.getTypeParameters(), factory);

        this.method = method;
        this.parameters = signature.getParameters();
        this.returnType = signature.getResult();
        this.exceptions = signature.getThrowsSignatures();
    }

    @Override
    public Type[] getParameterTypes() {
        Type[] types = resolvedParameters;
        if (types == null) {
            final TypeFactory factory = getFactory();
            final Type[] newTypes = new Type[parameters.length];

            for (int i = 0; i < parameters.length; i++) {
                final JavaTypeSignature parameter = parameters[i];
                newTypes[i] = parameter.getType(factory);
            }

            // cache result
            types = newTypes;
            resolvedParameters = newTypes;
            // discard old values
            // not thread safe
            parameters = null;
        }
        // be sure to return a copy
        return types.clone();
    }

    @Override
    public Type getReturnType() {
        Type type = resolvedReturnType;
        if (type == null) {
            type = returnType.getType(getFactory());

            // cache result
            resolvedReturnType = type;
            // discard old value
            // not thread safe
            returnType = null;
        }
        return type;
    }

    @Override
    public Type[] getExceptionTypes() {
        Type[] types = resolvedExceptions;
        if (types == null) {
            final TypeFactory factory = getFactory();
            final Type[] newTypes = new Type[exceptions.length];

            for (int i = 0; i < exceptions.length; i++) {
                final ThrowsSignature signature = exceptions[i];
                newTypes[i] = signature.getType(factory);
            }

            // cache result
            types = newTypes;
            resolvedExceptions = newTypes;
            // discard old values
            // not thread safe
            exceptions = null;
        }
        // be sure to return a copy
        return types.clone();
    }

    @Override
    public GenericDeclaration getOuterDeclaration() {
        final JCClass declaring = method.getDeclaringClass();
        if (declaring == null) {
            return null;
        }
        return declaring.getDeclaration();
    }

    @Override
    public JCMethod getDeclarer() {
        return method;
    }
}
