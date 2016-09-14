package org.obicere.bytecode.core.objects.code.frame.verification;

import org.obicere.bytecode.core.reader.code.frame.verification.VerificationTypeInfoReader;
import org.obicere.bytecode.core.type.Type;

/**
 */
public class ObjectVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "ObjectVariableInfo";

    private final Type type;

    public ObjectVariableInfo(final Type type) {
        super(VerificationTypeInfoReader.ITEM_OBJECT);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
