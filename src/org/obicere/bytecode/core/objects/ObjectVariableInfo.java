package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.VerificationTypeInfoReader;

/**
 */
public class ObjectVariableInfo extends VerificationTypeInfo {

    public static final String IDENTIFIER = "ObjectVariableInfo";

    private final int index;

    public ObjectVariableInfo(final int index) {
        super(VerificationTypeInfoReader.ITEM_OBJECT);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
