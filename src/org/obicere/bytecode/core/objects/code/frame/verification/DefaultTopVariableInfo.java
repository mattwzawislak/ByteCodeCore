package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.TopVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultTopVariableInfo extends AbstractVerificationTypeInfo implements TopVariableInfo {

    private static final TopVariableInfo INSTANCE = new DefaultTopVariableInfo();

    private DefaultTopVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_TOP);
    }

    public static TopVariableInfo getInstance() {
        return INSTANCE;
    }
}
