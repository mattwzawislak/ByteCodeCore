package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.objects.common.MethodType;
import org.obicere.bytecode.core.reader.constant.ConstantReader;
import org.obicere.bytecode.core.type.parser.SignatureParser;
import org.obicere.bytecode.core.type.signature.MethodSignature;

/**
 * @author Obicere
 */
public class ConstantMethodType extends Constant {

    private final int descriptorIndex;

    private volatile MethodType methodType;

    public ConstantMethodType(final ConstantPool constantPool, final int descriptorIndex) {
        super(constantPool, ConstantReader.CONSTANT_METHOD_TYPE);
        this.descriptorIndex = descriptorIndex;
    }

    public MethodType getMethodType() {
        if (methodType == null) {
            final ConstantUtf8 constantDescriptor = constantPool.get(descriptorIndex);
            final String descriptor = constantDescriptor.getBytes();
            final SignatureParser parser = new SignatureParser(descriptor);
            final MethodSignature signature = parser.parseMethodSignature();

            this.methodType = new MethodType(signature);
        }

        return methodType;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }

    @Override
    public String toString() {
        return constantPool.getAsString(descriptorIndex);
    }
}
