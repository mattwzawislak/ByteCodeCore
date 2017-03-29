package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.FloatVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultFloatVariableInfo extends AbstractVerificationTypeInfo implements FloatVariableInfo {

    private static final FloatVariableInfo INSTANCE = new DefaultFloatVariableInfo();

    private DefaultFloatVariableInfo() {
        super(VerificationTypeInfos.ITEM_FLOAT);
    }

    public static FloatVariableInfo getInstance() {
        return INSTANCE;
    }
}
