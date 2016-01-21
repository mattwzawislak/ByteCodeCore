package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

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
