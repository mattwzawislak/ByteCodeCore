package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.NullVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultNullVariableInfo extends AbstractVerificationTypeInfo implements NullVariableInfo {

    private static final NullVariableInfo INSTANCE = new DefaultNullVariableInfo();

    private DefaultNullVariableInfo() {
        super(VerificationTypeInfos.ITEM_NULL);
    }

    public static NullVariableInfo getInstance() {
        return INSTANCE;
    }
}
