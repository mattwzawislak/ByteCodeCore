package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.objects.code.block.label.Label;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class UninitializedVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "UninitializedVariableInfo";

    private final Label offset;

    public UninitializedVariableInfo(final Label offset) {
        super(VerificationTypeInfoReader.ITEM_UNINITIALIZED);
        this.offset = offset;
    }

    public Label getOffset() {
        return offset;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
