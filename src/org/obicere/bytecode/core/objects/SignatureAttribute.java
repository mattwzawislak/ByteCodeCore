package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.signature.ClassSignature;
import org.obicere.bytecode.core.objects.signature.FieldSignature;
import org.obicere.bytecode.core.objects.signature.MethodSignature;
import org.obicere.bytecode.core.objects.signature.QueueString;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class SignatureAttribute extends Attribute {

    private final int signatureIndex;

    public SignatureAttribute(final int signatureIndex) {

        this.signatureIndex = signatureIndex;
    }

    public int getSignatureIndex() {
        return signatureIndex;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        throw new UnsupportedOperationException("signatures cannot be modeled properly. Instead call the parseXX methods.");
    }

    public FieldSignature parseField(final ConstantPool constantPool) {
        return parseField(constantPool.getAsString(signatureIndex));
    }

    public MethodSignature parseMethod(final ConstantPool constantPool) {
        return parseMethod(constantPool.getAsString(signatureIndex));
    }


    public ClassSignature parseClass(final ConstantPool constantPool) {
        return parseClass(constantPool.getAsString(signatureIndex));
    }

    public static FieldSignature parseField(final String signature) {
        return FieldSignature.parse(new QueueString(signature));
    }

    public static MethodSignature parseMethod(final String signature) {
        return MethodSignature.parse(new QueueString(signature));
    }

    public static ClassSignature parseClass(final String signature) {
        return ClassSignature.parse(new QueueString(signature));
    }

}
