package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.signature.JavaTypeSignature;
import org.javacore.type.signature.MethodSignature;
import org.javacore.type.signature.ResultSignature;
import org.javacore.type.signature.ThrowsSignature;
import org.javacore.type.signature.TypeParameter;

/**
 * @author Obicere
 */
public class DefaultMethodSignature implements MethodSignature {

    private TypeParameter[]     typeParameters;
    private JavaTypeSignature[] parameters;
    private ResultSignature     result;
    private ThrowsSignature[]   throwsSignatures;

    public DefaultMethodSignature(final TypeParameter[] typeParameters, final JavaTypeSignature[] parameters, final ResultSignature result, final ThrowsSignature[] throwsSignatures) {
        this.typeParameters = typeParameters;
        this.parameters = parameters;
        this.result = result;
        this.throwsSignatures = throwsSignatures;
    }

    @Override
    public TypeParameter[] getTypeParameters() {
        return typeParameters;
    }

    @Override
    public JavaTypeSignature[] getParameters() {
        return parameters;
    }

    @Override
    public ResultSignature getResult() {
        return result;
    }

    @Override
    public ThrowsSignature[] getThrowsSignatures() {
        return throwsSignatures;
    }

}
