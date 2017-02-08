package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.signature.FieldSignature;
import org.javacore.type.signature.ReferenceTypeSignature;

/**
 * @author Obicere
 */
public class DefaultFieldSignature implements FieldSignature {

    private final ReferenceTypeSignature signature;

    public DefaultFieldSignature(final ReferenceTypeSignature signature) {
        this.signature = signature;
    }

    @Override
    public ReferenceTypeSignature getSignature() {
        return signature;
    }

}
