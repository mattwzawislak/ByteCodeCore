package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class IntegerVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "IntegerVariableInfo";

    public IntegerVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_INTEGER);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
