package org.obicere.bytecode.core.type.signature;

/**
 * @author Obicere
 */
public class FieldSignature {

    private final ReferenceTypeSignature signature;

    public FieldSignature(final ReferenceTypeSignature signature) {
        this.signature = signature;
    }

    public ReferenceTypeSignature getSignature() {
        return signature;
    }

}
