package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.signature.ClassSignature;
import org.javacore.type.signature.ClassTypeSignature;
import org.javacore.type.signature.TypeParameter;

/**
 * @author Obicere
 */
public class DefaultClassSignature implements ClassSignature {

    private final TypeParameter[]      parameters;
    private final ClassTypeSignature   superClass;
    private final ClassTypeSignature[] superInterfaces;

    public DefaultClassSignature(final TypeParameter[] parameters, final ClassTypeSignature superClass, final ClassTypeSignature[] superInterfaces) {
        this.parameters = parameters;
        this.superClass = superClass;
        this.superInterfaces = superInterfaces;
    }

    @Override
    public TypeParameter[] getTypeParameters() {
        return parameters;
    }

    @Override
    public ClassTypeSignature getSuperClass() {
        return superClass;
    }

    @Override
    public ClassTypeSignature[] getSuperInterfaces() {
        return superInterfaces;
    }
}
