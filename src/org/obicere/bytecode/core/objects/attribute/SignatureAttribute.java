package org.obicere.bytecode.core.objects.attribute;

/**
 * @author Obicere
 */
public class SignatureAttribute extends Attribute {

    public static final String IDENTIFIER = "SignatureAttribute";

    private final String signature;

    public SignatureAttribute(final String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
