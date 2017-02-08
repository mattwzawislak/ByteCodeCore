package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.LongVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultLongVariableInfo extends AbstractVerificationTypeInfo implements LongVariableInfo {

    private static final LongVariableInfo INSTANCE = new DefaultLongVariableInfo();

    private DefaultLongVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_LONG);
    }

    public static LongVariableInfo getInstance() {
        return INSTANCE;
    }
}
