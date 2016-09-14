package org.obicere.bytecode.core.type.generic;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.type.ClassType;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;
import org.obicere.bytecode.core.type.signature.JavaTypeSignature;
import org.obicere.bytecode.core.type.signature.MethodSignature;
import org.obicere.bytecode.core.type.signature.ThrowsSignature;
import org.obicere.bytecode.core.type.signature.TypeSignature;

/**
 * @author Obicere
 */
public class MethodGenericDeclaration extends AbstractGenericDeclaration {

    private final Method method;

    private volatile JavaTypeSignature[] parameters;

    private volatile TypeSignature returnType;

    private volatile ThrowsSignature[] exceptions;

    private volatile Type[] resolvedParameters;

    private volatile Type resolvedReturnType;

    private volatile Type[] resolvedExceptions;

    public MethodGenericDeclaration(final Method method, final MethodSignature signature, final TypeFactory factory) {
        super(signature.getTypeParameters(), factory);

        this.method = method;
        this.parameters = signature.getParameters();
        this.returnType = signature.getResult();
        this.exceptions = signature.getThrowsSignatures();
    }

    public Type[] getParameters() {
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

    public Type getReturnType() {
        Type type = resolvedReturnType;
        if(type == null){
            type = returnType.getType(getFactory());

            // cache result
            resolvedReturnType = type;
            // discard old value
            // not thread safe
            returnType = null;
        }
        return type;
    }

    public Type[] getExceptions() {
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
    protected GenericDeclaration getOuterDeclaration() {
        final ClassType outerType = method.getContainingClass();
        return outerType.getDeclaration();
    }
}
