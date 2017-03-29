package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.LongVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultLongVariableInfo extends AbstractVerificationTypeInfo implements LongVariableInfo {

    private static final LongVariableInfo INSTANCE = new DefaultLongVariableInfo();

    private DefaultLongVariableInfo() {
        super(VerificationTypeInfos.ITEM_LONG);
    }

    public static LongVariableInfo getInstance() {
        return INSTANCE;
    }
}
