package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 * @author Obicere
 */
public abstract class AbstractVerificationTypeInfo implements VerificationTypeInfo {

    private final int tag;

    public AbstractVerificationTypeInfo(final int tag) {
        this.tag = tag;
    }

    @Override
    public int getTag() {
        return tag;
    }
}
