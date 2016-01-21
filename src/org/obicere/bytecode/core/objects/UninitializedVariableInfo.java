package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

/**
 */
public class UninitializedVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "UninitializedVariableInfo";

    private final int offset;

    public UninitializedVariableInfo(final int offset) {
        super(VerificationTypeInfoReader.ITEM_UNINITIALIZED);
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
