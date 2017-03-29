package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.TopVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultTopVariableInfo extends AbstractVerificationTypeInfo implements TopVariableInfo {

    private static final TopVariableInfo INSTANCE = new DefaultTopVariableInfo();

    private DefaultTopVariableInfo() {
        super(VerificationTypeInfos.ITEM_TOP);
    }

    public static TopVariableInfo getInstance() {
        return INSTANCE;
    }
}
