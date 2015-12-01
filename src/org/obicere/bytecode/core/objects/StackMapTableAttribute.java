package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class StackMapTableAttribute extends Attribute {

    private final StackMapFrame[] entries;

    public StackMapTableAttribute(final StackMapFrame[] entries) {
        this.entries = entries;
    }

    public StackMapFrame[] getEntries() {
        return entries;
    }
}
