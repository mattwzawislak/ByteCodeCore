package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.IntegerVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultIntegerVariableInfo extends AbstractVerificationTypeInfo implements IntegerVariableInfo {

    private static final IntegerVariableInfo INSTANCE = new DefaultIntegerVariableInfo();

    private DefaultIntegerVariableInfo() {
        super(VerificationTypeInfos.ITEM_INTEGER);
    }

    public static IntegerVariableInfo getInstance() {
        return INSTANCE;
    }
}
