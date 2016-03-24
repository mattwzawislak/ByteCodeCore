package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.signature.ClassSignature;
import org.obicere.bytecode.core.objects.signature.FieldSignature;
import org.obicere.bytecode.core.objects.signature.MethodSignature;
import org.obicere.bytecode.core.objects.signature.QueueString;

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
        final FieldSignature s = FieldSignature.parse(new QueueString(signature));
        System.out.println("Field ("+signature+"): " + s);
        return s;
    }

    public static MethodSignature parseMethod(final String signature) {
        MethodSignature s =  MethodSignature.parse(new QueueString(signature));
        System.out.println("Method ("+signature+"): " + s);
        return s;
    }

    public static ClassSignature parseClass(final String signature) {
        ClassSignature s =  ClassSignature.parse(new QueueString(signature));
        System.out.println("Class ("+signature+"): " + s);
        return s;
    }

}
