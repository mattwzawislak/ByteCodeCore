package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.signature.ClassSignature;
import org.obicere.bytecode.core.objects.signature.FieldSignature;
import org.obicere.bytecode.core.objects.signature.MethodSignature;

/**
 * @author Obicere
 */
public class SignatureAttribute extends Attribute {

    public static final String IDENTIFIER = "SignatureAttribute";

    private final int signatureIndex;

    public SignatureAttribute(final int length, final int signatureIndex) {
        super(length);

        this.signatureIndex = signatureIndex;
    }

    public int getSignatureIndex() {
        return signatureIndex;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    public FieldSignature getAsFieldSignature(final ConstantPool constantPool) {
        return FieldSignature.parse(constantPool.getAsString(signatureIndex));
    }

    public MethodSignature getAsMethodSignature(final ConstantPool constantPool) {
        return MethodSignature.parse(constantPool.getAsString(signatureIndex));
    }

    public ClassSignature getAsClassSignature(final ConstantPool constantPool) {
        return ClassSignature.parse(constantPool.getAsString(signatureIndex));
    }
}
