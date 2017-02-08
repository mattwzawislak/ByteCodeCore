package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.ObjectVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.javacore.type.Type;

/**
 */
public class DefaultObjectVariableInfo extends AbstractVerificationTypeInfo implements ObjectVariableInfo {

    private final Type type;

    public DefaultObjectVariableInfo(final Type type) {
        super(VerificationTypeInfoReader.ITEM_OBJECT);
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
