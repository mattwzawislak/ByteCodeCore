package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DoubleVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "DoubleVariableInfo";

    public DoubleVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_DOUBLE);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
