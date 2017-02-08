package org.obicere.bytecode.core.objects.common;

import org.javacore.common.MethodType;
import org.javacore.type.signature.MethodSignature;

/**
 * @author Obicere
 */
public class DefaultMethodType implements MethodType {

    private final MethodSignature signature;

    public DefaultMethodType(final MethodSignature signature) {
        this.signature = signature;
    }

    @Override
    public MethodSignature getSignature() {
        return signature;
    }

}
