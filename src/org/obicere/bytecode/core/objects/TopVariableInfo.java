package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

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
