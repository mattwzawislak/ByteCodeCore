package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.DoubleVariableInfo;
import org.javacore.code.frame.verification.VerificationTypeInfos;

/**
 */
public class DefaultDoubleVariableInfo extends AbstractVerificationTypeInfo implements DoubleVariableInfo {

    private static final DoubleVariableInfo INSTANCE = new DefaultDoubleVariableInfo();

    private DefaultDoubleVariableInfo() {
        super(VerificationTypeInfos.ITEM_DOUBLE);
    }

    public static DoubleVariableInfo getInstance() {
        return INSTANCE;
    }
}
