package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.frame.verification.NullVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultNullVariableInfo extends AbstractVerificationTypeInfo implements NullVariableInfo {

    private static final NullVariableInfo INSTANCE = new DefaultNullVariableInfo();

    private DefaultNullVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_NULL);
    }

    public static NullVariableInfo getInstance() {
        return INSTANCE;
    }
}
