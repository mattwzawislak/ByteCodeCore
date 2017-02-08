package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.SignatureAttribute;

/**
 * @author Obicere
 */
public class DefaultSignatureAttribute extends AbstractAttribute implements SignatureAttribute {

    private final String signature;

    public DefaultSignatureAttribute(final String signature) {
        super("SignatureAttribute");
        this.signature = signature;
    }

    @Override
    public String getSignature() {
        return signature;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
