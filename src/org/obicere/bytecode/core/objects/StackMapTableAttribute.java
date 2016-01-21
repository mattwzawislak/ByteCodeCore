package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class StackMapTableAttribute extends Attribute {

    public static final String IDENTIFIER = "StackMapTableAttribute";

    private final StackMapFrame[] entries;

    public StackMapTableAttribute(final int length, final StackMapFrame[] entries) {
        super(length);

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
