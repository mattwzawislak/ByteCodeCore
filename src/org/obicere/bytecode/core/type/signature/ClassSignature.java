package org.obicere.bytecode.core.type.signature;

/**
 * @author Obicere
 */
public class ClassSignature {

    private final TypeParameter[]      parameters;
    private final ClassTypeSignature   superClass;
    private final ClassTypeSignature[] superInterfaces;

    public ClassSignature(final TypeParameter[] parameters, final ClassTypeSignature superClass, final ClassTypeSignature[] superInterfaces) {
        this.parameters = parameters;
        this.superClass = superClass;
        this.superInterfaces = superInterfaces;
    }

    public TypeParameter[] getTypeParameters() {
        return parameters;
    }

    public ClassTypeSignature getSuperClass() {
        return superClass;
    }

    public ClassTypeSignature[] getSuperInterfaces() {
        return superInterfaces;
    }
}
