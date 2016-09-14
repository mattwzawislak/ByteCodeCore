package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class TopVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "TopVariableInfo";

    public TopVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_TOP);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
