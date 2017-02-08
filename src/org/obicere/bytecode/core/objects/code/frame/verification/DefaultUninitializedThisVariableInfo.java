package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.UninitializedThisVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultUninitializedThisVariableInfo extends AbstractVerificationTypeInfo implements UninitializedThisVariableInfo {

    private static final UninitializedThisVariableInfo INSTANCE = new DefaultUninitializedThisVariableInfo();

    private DefaultUninitializedThisVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_UNINITIALIZED_THIS);
    }

    public static UninitializedThisVariableInfo getInstance() {
        return INSTANCE;
    }
}
