package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.ObjectVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;
import org.javacore.type.Type;

/**
 */
public class DefaultObjectVariableInfo extends AbstractVerificationTypeInfo implements ObjectVariableInfo {

    private final Type type;

    public DefaultObjectVariableInfo(final Type type) {
        super(VerificationTypeInfos.ITEM_OBJECT);
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
