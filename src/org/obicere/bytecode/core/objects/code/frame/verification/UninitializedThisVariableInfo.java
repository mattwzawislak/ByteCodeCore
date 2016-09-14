package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class UninitializedThisVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "UninitializedThisVariableInfo";

    public UninitializedThisVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_UNINITIALIZED_THIS);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
