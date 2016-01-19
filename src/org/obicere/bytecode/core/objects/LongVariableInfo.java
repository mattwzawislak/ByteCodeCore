package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

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
