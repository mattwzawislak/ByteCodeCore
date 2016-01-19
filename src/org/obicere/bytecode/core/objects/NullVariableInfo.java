package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

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
