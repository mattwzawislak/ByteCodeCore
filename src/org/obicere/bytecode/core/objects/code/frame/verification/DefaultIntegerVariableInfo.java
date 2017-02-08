package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.IntegerVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultIntegerVariableInfo extends AbstractVerificationTypeInfo implements IntegerVariableInfo {

    private static final IntegerVariableInfo INSTANCE = new DefaultIntegerVariableInfo();

    private DefaultIntegerVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_INTEGER);
    }

    public static IntegerVariableInfo getInstance() {
        return INSTANCE;
    }
}
