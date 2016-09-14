package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;

/**
 */
public class FloatVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "FloatVariableInfo";

    public FloatVariableInfo() {
        super(VerificationTypeInfoReader.ITEM_FLOAT);
    }

    @Override
    public String getIdentifier(){
        return IDENTIFIER;
    }
}
