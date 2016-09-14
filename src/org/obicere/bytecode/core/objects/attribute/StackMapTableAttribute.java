package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.code.frame.StackMapFrame;

/**
 * @author Obicere
 */
public class StackMapTableAttribute extends Attribute {

    public static final String IDENTIFIER = "StackMapTableAttribute";

    private final StackMapFrame[] entries;

    public StackMapTableAttribute(final StackMapFrame[] entries) {
        if (entries == null) {
            throw new NullPointerException("entries must be non-null");
        }

        this.entries = entries;
    }

    public StackMapFrame[] getEntries() {
        return entries;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
