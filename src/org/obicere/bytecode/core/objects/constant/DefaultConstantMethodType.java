package org.obicere.bytecode.core.objects.constant;

import org.javacore.common.MethodType;
import org.javacore.constant.ConstantMethodType;
import org.javacore.constant.ConstantPool;
import org.javacore.constant.ConstantUtf8;
import org.javacore.type.signature.MethodSignature;
import org.obicere.bytecode.core.objects.common.DefaultMethodType;
import org.obicere.bytecode.core.objects.type.parser.SignatureParser;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantMethodType extends AbstractConstant implements ConstantMethodType {

    private final int descriptorIndex;

    private volatile MethodType methodType;

    public DefaultConstantMethodType(final ConstantPool constantPool, final int descriptorIndex) {
        super(constantPool, ConstantReader.CONSTANT_METHOD_TYPE);
        this.descriptorIndex = descriptorIndex;
    }

    @Override
    public MethodType getMethodType() {
        if (methodType == null) {
            final ConstantUtf8 constantDescriptor = (ConstantUtf8) constantPool.get(descriptorIndex);
            final String descriptor = constantDescriptor.getValue();
            final SignatureParser parser = new SignatureParser(descriptor);
            final MethodSignature signature = parser.parseMethodSignature();

            this.methodType = new DefaultMethodType(signature);
        }

        return methodType;
    }
}
