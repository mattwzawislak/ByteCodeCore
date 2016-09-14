package org.obicere.bytecode.core.objects.common;

import org.obicere.bytecode.core.type.signature.MethodSignature;

/**
 * @author Obicere
 */
public class MethodType {

    private final MethodSignature signature;

    public MethodType(final MethodSignature signature) {
        this.signature = signature;
    }

    public MethodSignature getSignature() {
        return signature;
    }

}
