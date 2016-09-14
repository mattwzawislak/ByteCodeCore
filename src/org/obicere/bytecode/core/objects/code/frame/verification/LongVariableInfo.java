package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class LongVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "LongVariableInfo";

    public LongVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_LONG);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
