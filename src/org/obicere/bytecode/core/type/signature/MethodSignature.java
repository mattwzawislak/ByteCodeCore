package org.obicere.bytecode.core.type.signature;

/**
 * @author Obicere
 */
public class MethodSignature {

    private TypeParameter[]     typeParameters;
    private JavaTypeSignature[] parameters;
    private Result              result;
    private ThrowsSignature[]   throwsSignatures;

    public MethodSignature(final TypeParameter[] typeParameters, final JavaTypeSignature[] parameters, final Result result, final ThrowsSignature[] throwsSignatures) {
        this.typeParameters = typeParameters;
        this.parameters = parameters;
        this.result = result;
        this.throwsSignatures = throwsSignatures;
    }

    public TypeParameter[] getTypeParameters() {
        return typeParameters;
    }

    public JavaTypeSignature[] getParameters() {
        return parameters;
    }

    public Result getResult() {
        return result;
    }

    public ThrowsSignature[] getThrowsSignatures() {
        return throwsSignatures;
    }

}
