package org.obicere.bytecode.core.objects.code.frame.verification;

import org.javacore.code.block.label.Label;
import org.javacore.code.frame.verification.UninitializedVariableInfo;
import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class DefaultUninitializedVariableInfo extends AbstractVerificationTypeInfo implements UninitializedVariableInfo {

    private final Label offset;

    public DefaultUninitializedVariableInfo(final Label offset) {
        super(VerificationTypeInfoReader.ITEM_UNINITIALIZED);
        this.offset = offset;
    }

    @Override
    public Label getOffset() {
        return offset;
    }
}
