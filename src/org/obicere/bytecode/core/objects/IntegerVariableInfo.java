package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

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
