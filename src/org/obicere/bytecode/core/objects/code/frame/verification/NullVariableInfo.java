package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class NullVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "NullVariableInfo";

    public NullVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_NULL);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
